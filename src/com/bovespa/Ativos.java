package com.bovespa;

public class Ativos {

    private int codigoAcao;
    private String acao;
    private String nomeEmpresa;
    private double precoCompra;
    private double precoVenda;
    private double qtdAcao;
    private double emolumento;
    private double taxaLiquidacao;

    public Ativos() {
    }

    public double comprar() {
        return this.getPrecoCompra()*this.getQtdAcao();
    }

    public double vender() {
        return this.getPrecoVenda()*this.getQtdAcao();
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getQtdAcao() {
        return qtdAcao;
    }

    public void setQtdAcao(double qtdAcao) {
        this.qtdAcao = qtdAcao;
    }

    public double getEmolumento() {
        return emolumento;
    }

    public void setEmolumento(double emolumento) {
        this.emolumento = emolumento;
    }

    public double getTaxaLiquidacao() {
        return taxaLiquidacao;
    }

    public void setTaxaLiquidacao(double taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }

    @Override
    public String toString() {
        return "Ativos{" +
                "codigoAcao=" + codigoAcao +
                ", acao='" + acao + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", precoCompra=" + precoCompra +
                ", precoVenda=" + precoVenda +
                ", qtdAcao=" + qtdAcao +
                ", emolumento=" + emolumento +
                ", taxaLiquidação=" + taxaLiquidacao +
                '}';
    }
}
