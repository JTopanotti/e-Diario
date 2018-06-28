package controllers;

import models.*;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.*;
import play.data.Form;
import play.data.FormFactory;
import javax.inject.*;

import static play.libs.Json.toJson;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	private static Form<UserLogin> formularioLogin;sa
	private static Form<InfoAluno> informacoesAluno;
	private final UserRepository userRepository;
	private final HttpExecutionContext httpExecutionContext;
	private final FormFactory formFactory;

	@Inject
	public HomeController(FormFactory cf, UserRepository ur, HttpExecutionContext ec) {
		this.formFactory = cf;
		this.userRepository = ur;
		this.httpExecutionContext = ec;
	}

    public Result index() {
        return ok(views.html.index.render("Indice", Autenticacao.isLoggedIn(ctx())));
    }

    public Result login() {
    	formularioLogin = formFactory.form(UserLogin.class);
    	return ok(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, true));
    }

    public Result loginProfessor() {
		formularioLogin = formFactory.form(UserLogin.class);
		return ok(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, false));
	}

	public Result editarPerfil(String usuario){
		InfoAluno aluno = conexaoBD.getAluno(usuario);
		informacoesAluno = formFactory.form(InfoAluno.class).fill(aluno);
		return ok(views.html.editar_aluno.render("Informacao", Autenticacao.isLoggedIn(ctx()), aluno, informacoesAluno));
	}

    public Result logout() {
		session().clear();
        return ok(views.html.index.render("Home", Autenticacao.isLoggedIn(ctx())));
    }

    public Result perfil() {
		String usuario = ctx().session().get("username");
		return ok(views.html.profile.render("Perfil", Autenticacao.isLoggedIn(ctx()),
		                                     conexaoBD.getAluno(usuario)));
    }

    public Result perfilProfessor(){
		String usuario = ctx().session().get("username");
		InfoAluno[] alunos = conexaoBD.getAlunos(usuario);
		return ok(views.html.profile_prof.render("Perfil", Autenticacao.isLoggedIn(ctx()), alunos));
	}

    public Result postEditar(){
		informacoesAluno = formFactory.form(InfoAluno.class).bindFromRequest();
		InfoAluno aluno = informacoesAluno.get();
		System.out.println("postEditar: " + aluno.getBairro() + " " + aluno.getUsuario());
		conexaoBD.atualizarAluno(aluno);
		return ok(views.html.profile_prof.render("Perfil", Autenticacao.isLoggedIn(ctx()), conexaoBD.getAlunos(Autenticacao.getUser(ctx()))));
	}

    public Result postLogin(boolean aluno) {
    	formularioLogin = formFactory.form(UserLogin.class).bindFromRequest();

    	if(formularioLogin.hasErrors()) {
        	System.out.println("Has Errors");
    		flash("erro", "Credenciais de login invalidos");
			return badRequest(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, aluno));
    	} else {
    		session().clear();
    		session("username", formularioLogin.get().getUsername());
    		if(aluno)
				return redirect(routes.HomeController.perfil());
    		else
    			return redirect(routes.HomeController.perfilProfessor());
    	}
    }

    public CompletionStage<Result> addUser(){
		User user = formFactory.form(User.class).bindFromRequest().get();
		return userRepository.add(user).thenApplyAsync(u -> {
			return redirect(routes.HomeController.index());
		}, httpExecutionContext.current());
	}

	public CompletionStage<Result> getUsers(){
		return userRepository.list().thenApplyAsync(userStream -> {
			return ok(toJson(userStream.collect(Collectors.toList())));
		}, httpExecutionContext.current());
	}


}
