package modelos;

public class InfoUsuario {
	private String nome;
	private String usuario;
	
	public InfoUsuario(String nome, String usuario){
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
