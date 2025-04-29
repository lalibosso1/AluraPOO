package com.lalibosso1.AluraPOO.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoplano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao(){

        return totalDeAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoplano() {
        return incluidoNoplano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoplano(boolean incluidoNoplano) {
        this.incluidoNoplano = incluidoNoplano;
    }

    public void exibeFichaTecnica(){
        System.out.println("O nome do filme é : " +nome);
        System.out.println("O filme lançou em : " +anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}

