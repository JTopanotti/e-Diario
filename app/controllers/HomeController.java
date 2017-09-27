package controllers;

import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import modelos.UsuarioLogin;
import modelos.InfoUsuarioDB;

import javax.inject.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	private static Form<UsuarioLogin> formularioLogin;
	
	@Inject
	FormFactory criadorFormulario;

    public Result index() {
        return ok(views.html.index.render("Indice", false, null));
    }
    
    public Result login() {
    	System.out.println("Login");
        InfoUsuarioDB.addUsuario("jonathan", "senha");
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class);
    	return ok(views.html.login.render(formularioLogin));
    }
    
    public Result logout() {
    	System.out.println("Logout");
        return ok(views.html.index.render("Indice", false, null));
    }
    
    public Result perfil() {
    	System.out.println("Perfil");
    	return ok(views.html.index.render("PERFIL", false, null));
    }
    
    public Result postLogin() {
    	System.out.println("PostLogin");
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class).bindFromRequest();
    	
    	if(formularioLogin.hasErrors()) {
        	System.out.println("Has Errors");
    		//flash("erro", "Credenciais de login invalidos");
    		return badRequest(views.html.login.render(formularioLogin));
    	} else {
 /*   		session().clear();
    		session("usuario", formularioLogin.get().getUsuario()); */
    		return redirect(routes.HomeController.perfil());
    	}
    	
    }

}
