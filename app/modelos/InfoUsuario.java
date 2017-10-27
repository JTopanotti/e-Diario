package modelos;

public class InfoUsuario {
	private String nome;
	private String usuario;
	
	public InfoUsuario(String nome, String usuario/*, String senha, String endereco, int numero, String bairro, String observacoes, Float[] notas*/) {
		this.setNome(nome);
		this.setUsuario(usuario);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
