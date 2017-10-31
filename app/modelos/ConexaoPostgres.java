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
		//criarConexao();
		ResultSet resultados;
		try{
			Statement execucao = conexao.createStatement();
			String query = "select COALESCE(\n" +
					"\t(select nome from public.alunos where id_usuario = (select id from usuarios where username = \'"+ usuario +"\')),\n" +
					"\t(select nome from public.professores where id_usuario = (select id from usuarios where username = \'"+ usuario +"\'))\n" +
					"\t\n" +
					") from public.usuarios;";
			resultados = execucao.executeQuery(query);
			fecharConexao();
			return new InfoUsuario(resultados.getString(1), usuario);
		} catch(SQLException e){
			System.out.println("Error SQL: " + e);
			//fecharConexao();
			return null;
		}
	}

	public InfoAluno[] getAlunos(String professor){
		int quant_alunos;

		try{
			Statement execucao = conexao.createStatement();
			String query = "select count(*)";
		}

	}

	public static InfoAluno getAluno(String usuario){
		//criarConexao();
		ResultSet resultados;
		int id = 0, numero = 0;
		String nome = ".", endereco = ".", bairro = ".", observacoes = ".", senha = ".";
		Float[] notas = {new Float(0), new Float(0), new Float(0)};
		try {
			Statement execucao = conexao.createStatement();
			String query = "select id from public.usuarios where username = '" + usuario + "';";
			resultados = execucao.executeQuery(query);
			if(resultados.next()){id = resultados.getInt(1); }
			query = "select * from public.alunos where id_usuario = " + id + ";";
			resultados = execucao.executeQuery(query);
			if(resultados.next()) {
				id = resultados.getShort(1);
				nome = resultados.getString(2);
				endereco = resultados.getString(3);
				numero = resultados.getInt(4);
				bairro = resultados.getString(5);
				observacoes = resultados.getString(6);
				notas[0] = resultados.getFloat(7);
				notas[1] = resultados.getFloat(8);
				notas[2] = resultados.getFloat(9);
			}
		} catch(SQLException e) {
			System.err.println("Error SQL: " + e);
			//fecharConexao();
		}
		//fecharConexao();
		return new InfoAluno(nome, usuario, endereco, numero, bairro, observacoes, notas);
	}

	public static boolean autenticar(String usuario, String senha) {
		//criarConexao();
		try {
			boolean autenticado = false;
			Statement execucao = conexao.createStatement();
			String query = "select password from public.usuarios where username = '" + usuario + "';";
			ResultSet resultados = execucao.executeQuery(query);
			if(resultados.next())
				autenticado = (resultados.getString(1)).compareTo(senha) == 0;
			//fecharConexao();
			return autenticado;
		} catch(SQLException e) {
			System.out.print("Errro SQL: " + e);
			//fecharConexao();
			return false;
		}

	}
	
	
}
