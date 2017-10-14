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
		 
	}	

    public Result index() {
        return ok(views.html.index.render("Indice", Autenticacao.isLoggedIn(ctx()),  
        		                            Autenticacao.getInfoUsuario(ctx())));
    }
    
    public Result login() {
        InfoUsuarioDB.addUsuario("jonas", "j09o12n43");
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
    	ResultSet resultados;
    	int id = 0, numero = 0;
    	String nome = ".", endereco = ".", bairro = ".", observacoes = ".";
    	Float[] notas = {new Float(0), new Float(0), new Float(0)};
    	try {
			Statement execucao = conexaoPostgres.createStatement();
			String query = "select * from public.alunos where username = '" + Autenticacao.getUser(ctx()) + "';";
			resultados = execucao.executeQuery(query);
			if(resultados.next()) {
				id = resultados.getShort(1);
				nome = resultados.getString(2);
				endereco = resultados.getString(3);
				numero = resultados.getInt(4);
				bairro = resultados.getString(5);
			observacoes = resultados.getString(6);
			}
			query = "select * from public.notas where id_aluno = " + id + ";";
			resultados = execucao.executeQuery(query);
			if(resultados.next()) {
				notas[0] = resultados.getFloat(3);
				notas[1] = resultados.getFloat(2);
				notas[2] = resultados.getFloat(5);
			}
		    } catch(SQLException e) {
		    	System.err.println("Error SQL: " + e);
		    }
		return ok(views.html.profile.render("Perfil", Autenticacao.isLoggedIn(ctx()),
		                                     Autenticacao.getInfoUsuario(ctx()),
		                                     nome, endereco, numero, bairro, notas));
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
