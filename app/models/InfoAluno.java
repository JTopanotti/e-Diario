package models;

import play.data.validation.Constraints.Validate;
import play.data.validation.Constraints.Validatable;

@Validate
public class InfoAluno implements Validatable<String>{
    private String usuario;
    private String endereco;
    private int numero;
    private String bairro;
    private String observacoes;
    private Float[][] notas;
    private int[][] faltas;
    private float nota_1_portugues;
    private int falta_1_portugues;
    private float nota_2_portugues;
    private int falta_2_portugues;
    private float nota_3_portugues;
    private int falta_3_portugues;
    private float nota_1_matematica;
    private int falta_1_matematica;
    private float nota_2_matematica;
    private int falta_2_matematica;
    private float nota_3_matematica;
    private int falta_3_matematica;
    private float nota_1_historia;
    private int falta_1_historia;
    private float nota_2_historia;
    private int falta_2_historia;
    private float nota_3_historia;
    private int falta_3_historia;
    private float nota_1_geografia;
    private int falta_1_geografia;
    private float nota_2_geografia;
    private int falta_2_geografia;
    private float nota_3_geografia;
    private int falta_3_geografia;

    public void atualizarNotasFaltas(){
        Float[][] notas_new = new Float[3][4];
        int[][] faltas_new = new int[3][4];
        notas_new[0][0] = getNota_1_portugues();
        notas_new[0][1] = getNota_1_matematica();
        notas_new[0][2] = getNota_1_historia();
        notas_new[0][3] = getNota_1_geografia();
        notas_new[1][0] = getNota_2_portugues();
        notas_new[1][1] = getNota_2_matematica();
        notas_new[1][2] = getNota_2_historia();
        notas_new[1][3] = getNota_2_geografia();
        notas_new[2][0] = getNota_3_portugues();
        notas_new[2][1] = getNota_3_matematica();
        notas_new[2][2] = getNota_3_historia();
        notas_new[2][3] = getNota_3_geografia();

        faltas_new[0][0] = getFalta_1_portugues();
        faltas_new[0][1] = getFalta_1_matematica();
        faltas_new[0][2] = getFalta_1_historia();
        faltas_new[0][3] = getFalta_1_geografia();
        faltas_new[1][0] = getFalta_2_portugues();
        faltas_new[1][1] = getFalta_2_matematica();
        faltas_new[1][2] = getFalta_2_historia();
        faltas_new[1][3] = getFalta_2_geografia();
        faltas_new[2][0] = getFalta_3_portugues();
        faltas_new[2][1] = getFalta_3_matematica();
        faltas_new[2][2] = getFalta_3_historia();
        faltas_new[2][3] = getFalta_3_geografia();
        this.notas = notas_new;
        this.faltas = faltas_new;
    }

    public void setFalta_1_portugues(int falta_1_portugues) {
        this.falta_1_portugues = falta_1_portugues;
    }

    public void setNota_2_portugues(float nota_2_portugues) {
        this.nota_2_portugues = nota_2_portugues;
    }

    public void setFalta_2_portugues(int falta_2_portugues) {
        this.falta_2_portugues = falta_2_portugues;
    }

    public void setNota_3_portugues(float nota_3_portugues) {
        this.nota_3_portugues = nota_3_portugues;
    }

    public void setFalta_3_portugues(int falta_3_portugues) {
        this.falta_3_portugues = falta_3_portugues;
    }

    public void setNota_1_matematica(float nota_1_matematica) {
        this.nota_1_matematica = nota_1_matematica;
    }

    public void setFalta_1_matematica(int falta_1_matematica) {
        this.falta_1_matematica = falta_1_matematica;
    }

    public void setNota_2_matematica(float nota_2_matematica) {
        this.nota_2_matematica = nota_2_matematica;
    }

    public void setFalta_2_matematica(int falta_2_matematica) {
        this.falta_2_matematica = falta_2_matematica;
    }

    public void setNota_3_matematica(float nota_3_matematica) {
        this.nota_3_matematica = nota_3_matematica;
    }

    public void setFalta_3_matematica(int falta_3_matematica) {
        this.falta_3_matematica = falta_3_matematica;
    }

    public void setNota_1_historia(float nota_1_historia) {
        this.nota_1_historia = nota_1_historia;
    }

    public void setFalta_1_historia(int falta_1_historia) {
        this.falta_1_historia = falta_1_historia;
    }

    public void setNota_2_historia(float nota_2_historia) {
        this.nota_2_historia = nota_2_historia;
    }

    public void setFalta_2_historia(int falta_2_historia) {
        this.falta_2_historia = falta_2_historia;
    }

    public void setNota_3_historia(float nota_3_historia) {
        this.nota_3_historia = nota_3_historia;
    }

    public void setFalta_3_historia(int falta_3_historia) {
        this.falta_3_historia = falta_3_historia;
    }

    public void setNota_1_geografia(float nota_1_geografia) {
        this.nota_1_geografia = nota_1_geografia;
    }

    public void setFalta_1_geografia(int falta_1_geografia) {
        this.falta_1_geografia = falta_1_geografia;
    }

    public void setNota_2_geografia(float nota_2_geografia) {
        this.nota_2_geografia = nota_2_geografia;
    }

    public void setFalta_2_geografia(int falta_2_geografia) {
        this.falta_2_geografia = falta_2_geografia;
    }

    public void setNota_3_geografia(float nota_3_geografia) {
        this.nota_3_geografia = nota_3_geografia;
    }

    public void setFalta_3_geografia(int falta_3_geografia) {
        this.falta_3_geografia = falta_3_geografia;
    }

    public int getFalta_1_portugues() {
        return falta_1_portugues;
    }

    public float getNota_2_portugues() {
        return nota_2_portugues;
    }

    public int getFalta_2_portugues() {
        return falta_2_portugues;
    }

    public float getNota_3_portugues() {
        return nota_3_portugues;
    }

    public int getFalta_3_portugues() {
        return falta_3_portugues;
    }

    public float getNota_1_matematica() {
        return nota_1_matematica;
    }

    public int getFalta_1_matematica() {
        return falta_1_matematica;
    }

    public float getNota_2_matematica() {
        return nota_2_matematica;
    }

    public int getFalta_2_matematica() {
        return falta_2_matematica;
    }

    public float getNota_3_matematica() {
        return nota_3_matematica;
    }

    public int getFalta_3_matematica() {
        return falta_3_matematica;
    }

    public float getNota_1_historia() {
        return nota_1_historia;
    }

    public int getFalta_1_historia() {
        return falta_1_historia;
    }

    public float getNota_2_historia() {
        return nota_2_historia;
    }

    public int getFalta_2_historia() {
        return falta_2_historia;
    }

    public float getNota_3_historia() {
        return nota_3_historia;
    }

    public int getFalta_3_historia() {
        return falta_3_historia;
    }

    public float getNota_1_geografia() {
        return nota_1_geografia;
    }

    public int getFalta_1_geografia() {
        return falta_1_geografia;
    }

    public float getNota_2_geografia() {
        return nota_2_geografia;
    }

    public int getFalta_2_geografia() {
        return falta_2_geografia;
    }

    public float getNota_3_geografia() {
        return nota_3_geografia;
    }

    public int getFalta_3_geografia() {
        return falta_3_geografia;
    }

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
        /*
        this.setNota_1_portugues(getNota(1,1));
        this.setNota_2_portugues(getNota(2,1));
        this.setNota_3_portugues(getNota(3,1));
        this.setFalta_1_portugues(getFalta(1,1));
        this.setFalta_2_portugues(getFalta(2,1));
        this.setFalta_3_portugues(getFalta(3,1));

        this.setNota_1_matematica(getNota(1,2));
        this.setNota_2_matematica(getNota(2,2));
        this.setNota_3_matematica(getNota(3,2));
        this.setFalta_1_matematica(getFalta(1,2));
        this.setFalta_2_matematica(getFalta(2,2));
        this.setFalta_3_matematica(getFalta(3,2));

        this.setNota_1_historia(getNota(1,3));
        this.setNota_2_historia(getNota(2,3));
        this.setNota_3_historia(getNota(3,3));
        this.setFalta_1_historia(getFalta(1,3));
        this.setFalta_2_historia(getFalta(2,3));
        this.setFalta_3_historia(getFalta(3,3));

        this.setNota_1_geografia(getNota(1,4));
        this.setNota_2_geografia(getNota(2,4));
        this.setNota_3_geografia(getNota(3,4));
        this.setFalta_1_geografia(getFalta(1,4));
        this.setFalta_2_geografia(getFalta(2,4));
        this.setFalta_3_geografia(getFalta(3,4));
        */
    }

    @Override
    public String validate(){
        return null;
    }


    public void setNota_1_portugues(float nota_1_portugues) {
        this.nota_1_portugues = nota_1_portugues;
    }

    public float getNota_1_portugues() {

        return nota_1_portugues;
    }

    public Float getNota(int trimestre, int materia){
        return notas[trimestre - 1][materia - 1];
    }

    public int getFalta(int trimestre, int materia){
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
