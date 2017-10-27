package controllers;

import modelos.ConexaoPostgres;
import modelos.InfoUsuario;
import play.mvc.*;
import play.data.Form;
import play.data.FormFactory;
import play.db.*;
import modelos.UsuarioLogin;
import modelos.ContextoExecucao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.inject.*;
import play.mvc.Http.Context;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	private static Form<UsuarioLogin> formularioLogin;
	private ConexaoPostgres conexaoBD;

	@Inject
	FormFactory criadorFormulario;
	
	@Inject
	public HomeController() {
		conexaoBD = new ConexaoPostgres("playdb", "org.postgresql.Driver",
				"jdbc:postgresql://127.0.0.1:5432/playdb?user=jonathan&password=j09o12n43");
		 
	}	

    public Result index() {
        return ok(views.html.index.render("Indice", Autenticacao.isLoggedIn(ctx())));
    }
    
    public Result login() {
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class);
    	return ok(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, true));
    }

    public Result loginProfessor() {
		formularioLogin = criadorFormulario.form(UsuarioLogin.class);
		return ok(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, false));
	}

    
    public Result logout() {
		session().clear();
        return ok(views.html.index.render("Home", Autenticacao.isLoggedIn(ctx())));
    }
    
    public Result perfil() {
		String usuario = ctx().session().get("usuario");
		return ok(views.html.profile.render("Perfil", Autenticacao.isLoggedIn(ctx()),
		                                     ConexaoPostgres.getAluno(usuario)));
    }
    
    public Result postLogin() {
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class).bindFromRequest();
    	
    	if(formularioLogin.hasErrors()) {
        	System.out.println("Has Errors");
    		flash("erro", "Credenciais de login invalidos");
    		return badRequest(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, true));
    	} else {
    		session().clear();
    		session("usuario", formularioLogin.get().getUsuario()); 
    		return redirect(routes.HomeController.perfil());
    	}
    }

}
