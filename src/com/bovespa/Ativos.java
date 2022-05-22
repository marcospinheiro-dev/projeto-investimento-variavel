package com.bovespa;

public class Ativos {

    private String codigoAcao;
    private String acao;
    private String nomeEmpresa;
    private double precoCompra;
    private double qtdAcao;
    private double taxaLiquidacao = 0.00025;
    private double taxaNegociacao = 0.00005;


    public Ativos() {
    }

    public String getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(String codigoAcao) {
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

    public double getQtdAcao() {
        return qtdAcao;
    }

    public void setQtdAcao(double qtdAcao) {
        this.qtdAcao = qtdAcao;
    }

    public double getTaxaLiquidacao() {
        return taxaLiquidacao;
    }

    public void setTaxaLiquidacao(double taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }

    public double getTaxaNegociacao() {
        return taxaNegociacao;
    }

    public void setTaxaNegociacao(double taxaNegociacao) {
        this.taxaNegociacao = taxaNegociacao;
    }

    @Override
    public String toString() {
        return "Ativos{" +
                "codigoAcao='" + codigoAcao + '\'' +
                ", acao='" + acao + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", precoCompra=" + precoCompra +
                ", qtdAcao=" + qtdAcao +
                ", taxaLiquidacao=" + taxaLiquidacao +
                ", taxaNegociacao=" + taxaNegociacao +
                '}';
    }
}
