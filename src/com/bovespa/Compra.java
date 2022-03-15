package com.bovespa;

public class Compra extends Ativos {

    public double valorCompra() {
        return getPrecoCompra()*getQtdAcao();
    }

    public double valorEmolumento () {
        return (valorCompra() * (getEmolumento() + getTaxaLiquidacao()))/100d;
    }

    public double totalOperacaoCompra () {
        return valorCompra() + valorEmolumento();
    }

}
