package controllers;

import play.mvc.Result;
import play.mvc.Security;
import play.mvc.Http.Context;

public class Autenticacao extends Security.Authenticator {
	
	@Override
	public String getUsername(Context ctx) {
		return ctx.session().get("username");
	}
	
	@Override
	public Result onUnauthorized(Context ctx){
		return redirect("/");
	}
	
	public static String getUser(Context ctx) {
		return ctx.session().get("username");
	}
	
	public static boolean isLoggedIn(Context ctx) {
		return (getUser(ctx) != null);
	}
}
