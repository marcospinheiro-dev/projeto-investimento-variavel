package com.bovespa;

public class Venda extends Compra{
    public double lucro;

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public Venda(double qtd, double valor){
        this.setPrecoCompra(valor);
        this.setQtdAcao(qtd);
    }

    public double unitarioPontoEqVenda() {
        return (valorTotalCompra() + valorEmolumentoCompra())/getQtdAcao();
    }

    public double totalPontoEqVenda() {
        return unitarioPontoEqVenda() * getQtdAcao();
    }

    public double valorUnitarioVenda() {
        return ((unitarioPontoEqVenda() * (getLucro())/100) + unitarioPontoEqVenda());
    }

    public double valorTotalVenda() {
        return valorUnitarioVenda() * getQtdAcao();
    }
}
