package modelos;

import play.db.Databases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoPostgres{
	private static String nome_bd = "playdb";
	private static String driver_bd = "org.postgresql.Driver";
	private static String url_bd  = "jdbc:postgresql://127.0.0.1:5432/playdb?user=jonathan&password=j09o12n43";
	private static Connection conexao;

	
	public ConexaoPostgres(String nome, String driver, String url) {
		setDriverBd(driver);
		setNomeBd(nome);
		setUrlBd(url);
		criarConexao();
	}

	public void setNomeBd(String nome){
		nome_bd = nome;
	}

	public void setDriverBd(String driver){
		driver_bd = driver;
	}

	public void setUrlBd(String url){
		url_bd = url;
	}

	public Connection getConexao(){
		return conexao;
	}

	/* Criar conexao, tanto quando a classe é instanciada ou chamada estaticamente */
	private static void criarConexao(){
		conexao = Databases.createFrom(nome_bd, driver_bd, url_bd).getConnection();
	}
	private static void fecharConexao() {
		try {
			conexao.close();
		} catch(SQLException e){
			System.out.println("SQL ERROR: " + e);
		}
	}
	
	public static InfoUsuario getUsuario(String usuario) {
		criarConexao();
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
				senha = resultados.getString(8);
			}
			query = "select * from public.notas where id_aluno = " + id + ";";
			resultados = execucao.executeQuery(query);
			if(resultados.next()) {
				notas[0] = resultados.getFloat(2);
				notas[1] = resultados.getFloat(3);
				notas[2] = resultados.getFloat(4);
			}
    	} catch(SQLException e) {
    		System.err.println("Error SQL: " + e);
    	}
    	return new InfoUsuario(nome, usuario, senha, endereco, numero, bairro, observacoes, notas);
	}

	public static boolean autenticar(String usuario, String senha) {
		criarConexao();
		try {
			Statement execucao = conexao.createStatement();
			String query = "select password from public.alunos where username = '" + usuario + "';";
			ResultSet resultados = execucao.executeQuery(query);
			String senha1 = "j09o12n43";
			//return((resultados.getString(1)).compareTo(senha) == 0 ? true : false);
			return true;
			
		} catch(SQLException e) {
			System.out.print("Errro SQL: " + e);
			return false;
		}

	}
	
	
}
