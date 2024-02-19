package br.edu.infnet.testes.model;

public class Esporte {
    private String nome;
    private String posicao;
    private boolean craque;
    private int camisa;
    private float salario;

    public Esporte() {
    }

    public Esporte(String nome, String posicao, boolean craque, int camisa, float salario) {
        this.nome = nome;
        this.posicao = posicao;
        this.craque = craque;
        this.camisa = camisa;
        this.salario = salario;
    }

    public Esporte(String nome, String posicao, int camisa, float salario) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
        this.craque = false;
        this.salario = salario;
    }

    public float calcularSalario() {
        return (this.craque ? this.salario + 1000 : this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isCraque() {
        return craque;
    }

    public void setCraque(boolean craque) {
        this.craque = craque;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nJogador Cadastrado\n\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Posição: ").append(posicao).append("\n");
        sb.append("Craque do time: ").append(craque ? "Sim" : "Não").append("\n");
        sb.append("Camisa: ").append(camisa).append("\n");
        sb.append("Salário R$").append(calcularSalario());
        return sb.toString();
    }

}
