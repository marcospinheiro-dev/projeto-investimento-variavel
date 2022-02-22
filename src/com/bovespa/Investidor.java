package com.bovespa;

public class Investidor {

    private int codigo;
    private String nome;
    private String cpf;

    public Investidor(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Investidor() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Investidor{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
