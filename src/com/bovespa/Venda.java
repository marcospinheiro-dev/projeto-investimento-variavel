package com.bovespa;

public class Venda extends Ativos {

    public double valorVenda() {
        return getPrecoVenda()*getQtdAcao();
    }

    public double valorEmolumento () {
        return (valorVenda() * (getEmolumento() + getTaxaLiquidacao()))/100d;
    }

    public double totalOperacaoVenda () {
        return valorVenda() - valorEmolumento();
    }
}
