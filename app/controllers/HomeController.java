package controllers;

import modelos.*;
import play.mvc.*;
import play.data.Form;
import play.data.FormFactory;
import play.db.*;

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
	private static Form<InfoAluno> informacoesAluno;
	private static ConexaoPostgres conexaoBD;

	@Inject
	FormFactory criadorFormulario;
	
	@Inject
	public HomeController() {
		conexaoBD = new ConexaoPostgres("playdb", "org.postgresql.Driver",
				"jdbc:postgresql://127.0.0.1:5432/playdb?user=jonathan&password=j09o12n43");
		 
	}	

	public static boolean autenticar(String usuario, String senha){
		return conexaoBD.autenticar(usuario, senha);
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

	public Result editarPerfil(String usuario){
		InfoAluno aluno = conexaoBD.getAluno(usuario);
		informacoesAluno = criadorFormulario.form(InfoAluno.class).fill(aluno);
		return ok(views.html.editar_aluno.render("Informacao", Autenticacao.isLoggedIn(ctx()), aluno, informacoesAluno));
	}
    
    public Result logout() {
		session().clear();
        return ok(views.html.index.render("Home", Autenticacao.isLoggedIn(ctx())));
    }
    
    public Result perfil(boolean aluno) {
		String usuario = ctx().session().get("usuario");
		if(aluno)
			return ok(views.html.profile.render("Perfil", Autenticacao.isLoggedIn(ctx()),
		                                     conexaoBD.getAluno(usuario)));
		else {
			InfoAluno[] alunos = conexaoBD.getAlunos(usuario);
			return ok(views.html.profile_prof.render("Perfil", Autenticacao.isLoggedIn(ctx()), alunos));
		}
    }

    public Result postEditar(){
		return ok(views.html.index.render("Indice", Autenticacao.isLoggedIn(ctx())));
	}
    
    public Result postLogin(boolean aluno) {
    	formularioLogin = criadorFormulario.form(UsuarioLogin.class).bindFromRequest();
    	
    	if(formularioLogin.hasErrors()) {
        	System.out.println("Has Errors");
    		flash("erro", "Credenciais de login invalidos");
			return badRequest(views.html.login.render("Login", Autenticacao.isLoggedIn(ctx()), formularioLogin, aluno));
    	} else {
    		session().clear();
    		session("usuario", formularioLogin.get().getUsuario());
			return redirect(routes.HomeController.perfil(aluno));
    	}
    }

}
