package models;

import play.db.jpa.JPAApi;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;
import static java.util.concurrent.CompletableFuture.supplyAsync;

public class JPAUserRepository implements UserRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAUserRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<User> add(User user) {
        return supplyAsync(() -> wrap(em -> insert(em, user)), executionContext);
    }

    @Override
    public CompletionStage<Stream<User>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    @Override
    public CompletionStage<Boolean> authenticate(String username, String password) {
        return supplyAsync(() ->
                        wrap(em -> authenticate(username, password, em)),
                executionContext);
    }

    private User insert(EntityManager em, User user) {
        em.persist(user);
        return user;
    }

    private Stream<User> list(EntityManager em) {
        List<User> users = em.createQuery("select * from public.users", User.class).getResultList();
        return users.stream();
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Boolean authenticate(String username, String password, EntityManager em) {
        try {
            String result =  (String) em.createQuery(
                    "select password from public.usuarios = ':username';")
                    .setParameter("username", username).getResultList().get(0);
            return result.equals(password);
        } catch (NullPointerException e){
            System.out.println("SQL Query returned NULL list: " + e);
        }
        return false;
    }
}
