package models;

/*  BEING DEPRECATED
 *  FOR BETTER IMPLEMENTATION
 *  IN JPA REPOSITORY CLASSES
 */




import play.db.Database;
import play.db.NamedDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import play.libs.concurrent.CustomExecutionContext;

import javax.inject.Inject;

@javax.inject.Singleton
public class ConexaoPostgres{

	private Database db;
	private CustomExecutionContext executionContext;

	@Inject
	public ConexaoPostgres(@NamedDatabase("playdb") Database db, CustomExecutionContext executionContext){
		this.db = db;
		this.executionContext = executionContext;
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

	public User getUsername(String username) {
	    int codigo = getCodigoUsuario(username);
	    if(codigo > 0)
	        return new User(codigo, username);
	    else
	        return null;
	}

	public void atualizarAluno(InfoAluno aluno){
		String query;
		aluno.atualizarNotasFaltas();
		System.out.println("atualizarAluno: " + aluno.getBairro() + " " + aluno.getUsuario());
		try{
			query = "update public.alunos set endereco = '" + aluno.getEndereco() + "'," +
					"numero = " + aluno.getNumero() + "," +
					"bairro = '" + aluno.getBairro() + "'," +
					"observacao = '" + aluno.getObservacoes() + "' where id_usuario = " + getCodigoUsuario(aluno.getUsuario());
			conexao.createStatement().execute(query);
			for(int i = 0; i < 3; i++) {
				query = "update public.notas set portugues = " + aluno.getNota(i + 1,1) + "," +
						"matematica = " + aluno.getNota(i + 1,2) + "," +
						"historia = " + aluno.getNota(i + 1, 3) + "," +
						"geografia = " + aluno.getNota(i + 1, 4) + " where trimestre = " + (i + 1) + " and id_aluno = " + getCodigoUsuario(aluno.getUsuario()) + ";";
				conexao.createStatement().execute(query);
				query = "update public.faltas set portugues = " + aluno.getFalta(i + 1,1) + "," +
						"matematica = " + aluno.getFalta(i + 1,2) + "," +
						"historia = " + aluno.getFalta(i + 1, 3) + "," +
						"geografia = " + aluno.getFalta(i + 1, 4) + " where trimestre = " + (i + 1) + " and id_aluno = " + getCodigoUsuario(aluno.getUsuario()) + ";";
				conexao.createStatement().execute(query);
			}
		} catch (SQLException e){
			System.out.println("SQL ERROR: " + e);
		}
	}

	private int getCodigoUsuario(String usuario){
	    Statement execucao;
	    String query;
	    ResultSet resultados;
	    System.out.println("User: " + usuario);
        try{
            execucao = conexao.createStatement();
            query = "select id from usuarios where username = '" + usuario + "';";
            resultados = execucao.executeQuery(query);
            if(resultados.next())
            	return resultados.getInt(1);
            else
            	return 0;

        } catch(SQLException e){
            System.out.println("Error SQL: " + e);
            return 0;
        }
    }

	public InfoAluno[] getAlunos(String professor){
		int quant_alunos;
		ArrayList<InfoAluno> alunos = new ArrayList<InfoAluno>();
		Statement execucao;
		String query;
		ResultSet resultados;
		try{
			execucao = conexao.createStatement();
			query = "select tipo, username from public.usuarios";
			resultados = execucao.executeQuery(query);
			while(resultados.next()){
				if(resultados.getInt(1) == 0){
					alunos.add(getAluno(resultados.getString(2)));
				}
			}

		} catch(SQLException e) {
			System.out.println("SQL Error:" + e);
			return null;
		}
		InfoAluno[] alunos_array = new 	InfoAluno[alunos.size()];
		return alunos.toArray(alunos_array);

	}

	private Float[][] getNotas(int id){
		ResultSet resultados;
		Float[][] notas = new Float[3][4];
		/*try{
			String query = "select * from public.notas where id_aluno = " + id + " order by 2;";
			resultados = conexao.createStatement().executeQuery(query);
			while(resultados.next()){
				notas[resultados.getInt(2)-1][0] = resultados.getFloat(3);
				notas[resultados.getInt(2)-1][1] = resultados.getFloat(4);
				notas[resultados.getInt(2)-1][2] = resultados.getFloat(5);
				notas[resultados.getInt(2)-1][3] = resultados.getFloat(6);
			}
		} catch (SQLException e){
			System.out.println("SQL ERROR: " + e);
			return null;
		}*/
		return notas;
	}

	private int[][] getFaltas(int id){
		ResultSet resultados;
		int[][] faltas = new int[3][4];
		/*try{
			String query = "select * from public.faltas where id_aluno = " + id + " order by 2;";
			resultados = conexao.createStatement().executeQuery(query);
			while(resultados.next()){
				faltas[resultados.getInt(2)-1][0] = resultados.getInt(3);
				faltas[resultados.getInt(2)-1][1] = resultados.getInt(4);
				faltas[resultados.getInt(2)-1][2] = resultados.getInt(5);
				faltas[resultados.getInt(2)-1][3] = resultados.getInt(6);
			}
		} catch (SQLException e){
			System.out.println("SQL ERROR: " + e);
			return null;
		}*/
		return faltas;
	}

	public InfoAluno getAluno(String usuario){
		//criarConexao();
		ResultSet resultados;
		int id = 0, numero = 0;
		String nome = ".", endereco = ".", bairro = ".", observacoes = ".", senha = ".";
		Float[][] notas = new Float[3][4];
		int[][] faltas = new int[3][4];
		try {
			Statement execucao = conexao.createStatement();
			String query = "select id from public.usuarios where username = '" + usuario + "';";
			resultados = execucao.executeQuery(query);
			if(resultados.next()){id = resultados.getInt(1); }
			query = "select * from public.alunos where id_usuario = " + id + ";";
			resultados = execucao.executeQuery(query);
			if(resultados.next()) {
				id = resultados.getShort(1);
				notas = getNotas(id);
				faltas = getFaltas(id);
				nome = resultados.getString(2);
				endereco = resultados.getString(3);
				numero = resultados.getInt(4);
				bairro = resultados.getString(5);
				observacoes = resultados.getString(6);
			}
		} catch(SQLException e) {
			System.err.println("Error SQL: " + e);
			//fecharConexao();
		}
		//fecharConexao();
		return new InfoAluno(nome, usuario, endereco, numero, bairro, observacoes, notas, faltas);
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
