package com.bovespa;

public class Main {

    public static void main(String[] args) {

        Investidor investidor = new Investidor();
        investidor.setCodigo(1);
        investidor.setNome("Marcos Aurélio");
        investidor.setCpf("123.456.789-00");
        System.out.println("-------------------------------------");
        System.out.println(investidor);

        Ativos atv = new Ativos();
        atv.setCodigoAcao("BBDC3");
        atv.setAcao("Banco do Brasil");
        atv.setNomeEmpresa("Banco do Brasil S/A");
        //atv.setPrecoCompra(23.50);
        //atv.setQtdAcao(200);
        //atv.comprar(23.5, 200);
        System.out.println(atv);
        System.out.println("Valor da compra: " + atv.comprar(23, 200));

    }
}
