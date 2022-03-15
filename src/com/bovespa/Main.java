package com.bovespa;

public class Main {

    public static void main(String[] args) {

        Investidor investidor = new Investidor();
        investidor.setCodigo(1);
        investidor.setNome("Marcos Aurélio");
        investidor.setCpf("123.456.789-00");
        System.out.println("-------------------------------------");
        System.out.println("I N V E S T I D O R");
        System.out.println(investidor);
        Compra compra = new Compra();
        Venda venda = new Venda();

        Ativos atv = new Ativos();
        atv.setCodigoAcao("BBDC3");
        atv.setAcao("Banco do Brasil");
        atv.setNomeEmpresa("Banco do Brasil S/A");
        compra.setEmolumento(0.4);
        compra.setTaxaLiquidacao(0.8);
        compra.setPrecoCompra(2.50);
        compra.setQtdAcao(200);
        compra.valorCompra();
        compra.valorEmolumento();
        compra.totalOperacaoCompra();

        venda.setEmolumento(0.6);
        venda.setTaxaLiquidacao(1.4);
        venda.setPrecoVenda(3.0);
        venda.setQtdAcao(300);
        venda.valorVenda();
        venda.valorEmolumento();
        venda.totalOperacaoVenda();

        System.out.println("A T I V O");
        System.out.println(atv);
        System.out.println("C O M P R A");
        System.out.printf("Valor da compra: %.2f%n", compra.valorCompra());
        System.out.printf("Valor dos emolumentos: %.2f%n", compra.valorEmolumento());
        System.out.println("Total da operacao: " + compra.totalOperacaoCompra());

        System.out.println("V E N D A");
        System.out.printf("Valor da venda: %.2f%n", venda.valorVenda());
        System.out.printf("Valor dos emolumentos: %.2f%n", venda.valorEmolumento());
        System.out.println("Total da operacao: " + venda.totalOperacaoVenda());


    }
}
