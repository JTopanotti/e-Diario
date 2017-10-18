package controllers;

import modelos.ConexaoPostgres;
import modelos.InfoUsuario;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.Http.Context;

public class Autenticacao extends Security.Authenticator {
	
	@Override
	public String getUsername(Context ctx) {
		return ctx.session().get("usuario");
	}
	
	@Override
	public Result onUnauthorized(Context ctx){
		return redirect("/");
	}
	
	public static String getUser(Context ctx) {
		return ctx.session().get("usuario");
	}
	
	public static boolean isLoggedIn(Context ctx) {
		return (getUser(ctx) != null);
	}
	
	public static InfoUsuario getInfoUsuario(Context ctx) {
		return (isLoggedIn(ctx) ? ConexaoPostgres.getUsuario(getUser(ctx)) : null);
	}
}
