package controllers;

import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.db.*;
import modelos.UsuarioLogin;
import modelos.InfoUsuarioDB;
import modelos.ContextoExecucao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.inject.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	private static Form<UsuarioLogin> formularioLogin;
	//private ContextoExecucao meuContexto;
	private Connection conexaoPostgres;
	
	@Inject
	FormFactory criadorFormulario;
	
	@Inject
	public HomeController(ContextoExecucao contexto) {
		//meuContexto = contexto;
		conexaoPostgres = Databases.createFrom("playdb", "org.postgresql.Driver", 
				            "jdbc:postgresql://127.0.0.1:5432/playdb?user=jonathan&password=j09o12n43")
							.getConnection();
		try {
			Statement execucao = conexaoPostgres.createStatement();
			String query = "SELECT * FROM usuarios";
			ResultSet resultados = execucao.executeQuery(query);
			while(resultados.next()) {
				System.out.println("Dados: " + resultados.getString(1) + " " + resultados.getString(2));
			}
		} catch(SQLException e) {
			System.err.println("Error SQL: " + e);
		}
		 
	}	

    public Result index() {
        return ok(views.html.index.render("Indice", Autenticacao.isLoggedIn(ctx()),  
        		                            Autenticacao.getInfoUsuario(ctx())));
    }
    
    public Result login() {
        InfoUsuarioDB.addUsuario("jonathan", "senha");
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class);
    	return ok(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()),
    			                            Autenticacao.getInfoUsuario(ctx()), formularioLogin));
    }
    
    public Result logout() {
		session().clear();
        return ok(views.html.index.render("Home", Autenticacao.isLoggedIn(ctx()),  
        		                            Autenticacao.getInfoUsuario(ctx())));
    }
    
    public Result perfil() {
    	return ok(views.html.index.render("PERFIL", Autenticacao.isLoggedIn(ctx()), 
    			                            Autenticacao.getInfoUsuario(ctx())));
    }
    
    public Result postLogin() {
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class).bindFromRequest();
    	
    	if(formularioLogin.hasErrors()) {
        	System.out.println("Has Errors");
    		flash("erro", "Credenciais de login invalidos");
    		return badRequest(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()),  
    				                                    Autenticacao.getInfoUsuario(ctx()), formularioLogin));
    	} else {
    		session().clear();
    		session("usuario", formularioLogin.get().getUsuario()); 
    		return redirect(routes.HomeController.perfil());
    	}
    	
    }

}
