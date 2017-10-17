package modelos;

public class InfoUsuario {
	private String usuario;
	private String senha;
	private String endereco;
	private int numero;
	private String bairro;
	private Float[] notas;
	
	public InfoUsuario(String usuario, String senha, String endereco, int numero, String bairro, Float[] notas) {
		this.setUsuario(usuario);
		this.setSenha(senha);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setNumero(numero);
		this.setNotas(notas);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Float[] getNotas() {
		return notas;
	}

	public void setNotas(Float[] notas) {
		this.notas = notas;
	}
	
}
