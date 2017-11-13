package modelos;

import controllers.HomeController;
import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;
import play.data.validation.ValidationError;
import javax.xml.bind.ValidationException;

@Validate
public class InfoAluno implements Validatable<String>{
    private String usuario;
    private String endereco;
    private int numero;
    private String bairro;
    private String observacoes;

    public float nota_1_portugues;
    public int falta_1_portugues;
    public float nota_2_portugues;
    public int falta_2_portugues;
    public float nota_3_portugues;
    public int falta_3_portugues;

    public float nota_1_matematica;
    public int falta_1_matematica;
    public float nota_2_matematica;
    public int falta_2_matematica;
    public float nota_3_matematica;
    public int falta_3_matematica;

    public float nota_1_historia;
    public int falta_1_historia;
    public float nota_2_historia;
    public int falta_2_historia;
    public float nota_3_historia;
    public int falta_3_historia;

    public float nota_1_geografia;
    public int falta_1_geografia;
    public float nota_2_geografia;
    public int falta_2_geografia;
    public float nota_3_geografia;
    public int falta_3_geografia;

    private Float[][] notas;
    private int[][] faltas;

    public InfoAluno(){

    }
    public InfoAluno(String nome, String usuario, String endereco, int numero, String bairro, String observacoes, Float[][] notas, int[][] faltas) {
        this.setNome(nome);
        this.setUsuario(usuario);
        this.setEndereco(endereco);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setObservacoes(observacoes);
        this.setNotas(notas);
        this.setFaltas(faltas);
    }

    @Override
    public String validate(){
        return "OK";
    }

    public Float getNota(int trimestre, int materia){
        /*System.out.println("Trimestre:" + trimestre);
        System.out.println("Nota:" + notas[trimestre - 1][materia - 1]);*/
        return notas[trimestre - 1][materia - 1];
    }

    public int getFalta(int trimestre, int materia){
       /* System.out.println("Trimestre:" + trimestre);
        System.out.println("Falta:" + faltas[trimestre - 1][materia - 1]); */
        return faltas[trimestre - 1][materia - 1];
    }

    public int[][] getFaltas(){ return faltas; }

    public void setFaltas(int[][] faltas){ this.faltas = faltas; }

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

    public Float[][] getNotas() {
        return notas;
    }

    public void setNotas(Float[][] notas) {
        this.notas = notas;
    }
}
