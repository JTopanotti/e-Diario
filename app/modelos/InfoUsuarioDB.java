package modelos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import controllers.Autenticacao;
import modelos.InfoUsuario;

public class InfoUsuarioDB {
	
	public static void addUsuario(String usuario, String senha) {
		//Implementar insert em BD
	}
	
	public static boolean existeUsuario(String usuario, Connection conexaoPostgres) {
		try {
			Statement execucao = conexaoPostgres.createStatement();
			String query = "select 1 from public.alunos where username = '" + usuario + "';";
			ResultSet resultados = execucao.executeQuery(query);
			if(resultados.next()) return true;
		} catch(SQLException e) {
		    	System.err.println("Error SQL: " + e);
		}
		return false;
	}
	
	public static InfoUsuario getUsuario(String usuario) {
		
	}
	
	public static boolean autenticar(String usuario, String senha) {
		return((usuario != null) &&
			   (senha != null) &&
			   existeUsuario(usuario) &&
			   getUsuario(usuario).getSenha().equals(senha));				
	}

}
