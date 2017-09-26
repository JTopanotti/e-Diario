package controllers;

import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import modelos.FormularioLogin;
import modelos.InfoUsuarioDB;

import javax.inject.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	private static Form<FormularioLogin> formularioLogin;
	
	@Inject
	FormFactory criadorFormulario;

    public Result index() {
        return ok(views.html.index.render("Indice", false, null));
    }
    
    public Result login() {
        InfoUsuarioDB.addUsuario("jonathan", "senha");
    	formularioLogin = criadorFormulario.form(FormularioLogin.class);
    	return ok(views.html.login.render(formularioLogin));
    }
    
    public Result logout() {
        return ok(views.html.index.render("Indice", false, null));
    }
    
    public Result perfil() {
    	return ok(views.html.index.render("PERFIL", false, null));
    }
    
    public Result postLogin() {
    	System.out.println("TESTE");
    	formularioLogin = criadorFormulario.form(FormularioLogin.class).bindFromRequest();
    	if(formularioLogin.hasErrors()) {
    		flash("erro", "Credenciais de login invalidos");
    		return badRequest(views.html.login.render(formularioLogin));
    	} else {
    		session().clear();
    		session("usuario", formularioLogin.get().usuario);
    		return redirect(routes.HomeController.perfil());
    	}
    	
    }

}
