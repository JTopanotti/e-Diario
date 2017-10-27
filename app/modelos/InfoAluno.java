package modelos;

public class InfoAluno {
    private String usuario;
    private String endereco;
    private int numero;
    private String bairro;
    private String observacoes;
    private Float[] notas;

    public InfoAluno(String nome, String usuario, String endereco, int numero, String bairro, String observacoes, Float[] notas) {
        this.setNome(nome);
        this.setUsuario(usuario);
        this.setEndereco(endereco);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setObservacoes(observacoes);
        this.setNotas(notas);
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Float[] getNotas() {
        return notas;
    }

    public void setNotas(Float[] notas) {
        this.notas = notas;
    }
}
