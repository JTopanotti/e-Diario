package modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controllers.Autenticacao;

public class ConexaoPostgres{
	private Connection conexao;

	
	public ConexaoPostgres(Connection conexao) {
		this.conexao = conexao;
	}
	
	public InfoUsuario getUsuario(String usuario) {
		ResultSet resultados;
    	int id = 0, numero = 0;
    	String nome = ".", endereco = ".", bairro = ".", observacoes = ".", senha = ".";
    	Float[] notas = {new Float(0), new Float(0), new Float(0)};
    	try {
			Statement execucao = conexao.createStatement();
			String query = "select * from public.alunos where username = '" + usuario + "';";
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
    	return new InfoUsuario(usuario, senha, endereco, numero, bairro, notas)
	}
	
	
	public boolean autenticar(String usuario, String senha) {
		return false;
	}
	
	
	
	
}
