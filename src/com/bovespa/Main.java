package com.bovespa;

public class Main {

    public static void main(String[] args) {

        Investidor investidor = new Investidor();
        investidor.setCodigo(1);
        investidor.setNome("Marcos Aurélio");
        investidor.setCpf("123.456.789-00");
        System.out.println(investidor);

        Ativos atv = new Ativos();
        atv.setCodigoAcao("BBDC3");
        atv.setAcao("Banco do Brasil");
        System.out.println(atv);

    }
}
