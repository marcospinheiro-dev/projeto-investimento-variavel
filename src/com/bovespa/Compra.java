package com.bovespa;

public class Compra extends Ativos{


    public double valorCompra() {
        return this.getPrecoCompra() * this.getQtdAcao();
    }

    public double valorEmolumentoCompra () {
        return this.valorCompra() * (this.getTaxaNegociacao() + this.getTaxaLiquidacao());
    }

    public double valorTotalCompra() {

        return valorCompra() + valorEmolumentoCompra();
    }

}
