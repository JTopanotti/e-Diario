package modelos;

public class InfoUsuario {
	private String nome;
	private String usuario;
	private String endereco;
	private int numero;
	private String bairro;
	private String observacoes;
	private Float[] notas;
	
	public InfoUsuario(String nome, String usuario, String senha, String endereco, int numero, String bairro, String observacoes, Float[] notas) {
		this.setNome(nome);
		this.setUsuario(usuario);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setNumero(numero);
		this.setObservacoes(observacoes);
		this.setNotas(notas);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
