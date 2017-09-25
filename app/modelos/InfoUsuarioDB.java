package modelos;

import java.util.HashMap;
import java.util.Map;
import modelos.InfoUsuario;

public class InfoUsuarioDB {
	
	private static Map<String, InfoUsuario> infousuarios = new HashMap<String, InfoUsuario>();
	
	public static void addUsuario(String usuario, String senha) {
		infousuarios.put(usuario, new InfoUsuario(usuario, senha));
	}
	
	public static boolean existeUsuario(String usuario) {
		return infousuarios.containsKey(usuario);
	}
	
	public static InfoUsuario getUsuario(String usuario) {
		return infousuarios.get((usuario == null) ? "" : usuario);
	}
	
	public static boolean autenticar(String usuario, String senha) {
		return((usuario != null) &&
			   (senha != null) &&
			   existeUsuario(usuario) &&
			   getUsuario(usuario).getSenha().equals(senha));				
	}

}
