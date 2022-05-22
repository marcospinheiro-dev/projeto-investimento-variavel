package com.bovespa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Investidor investidor = new Investidor();
        System.out.println("Nome do investidor: ");
        investidor.setNome(scan.nextLine());
        System.out.println("CPF do investidor: ");
        investidor.setCpf(scan.nextLine());

        //investidor.setNome("Marcos Aurélio");
        //investidor.setCpf("123.456.789-00");
        //System.out.println("I N V E S T I D O R");

        System.out.println("Quantidade de ações compradas: ");
        double qtd = scan.nextDouble();

        System.out.println("Valor da ação: ");
        double valor = scan.nextDouble();

        Venda venda = new Venda(qtd, valor);

        System.out.println("Pretenção de lucro em %: ");
        venda.setLucro(scan.nextDouble());

        System.out.println("-------------------------------------");
        System.out.println(investidor);
        System.out.printf("Valor da compra: %.3f\n", venda.valorCompra());
        System.out.printf("Valor dos emolumentos da compra é: %.3f\n", venda.valorEmolumentoCompra());
        System.out.printf("Valor total da compra é: %.3f\n", venda.valorTotalCompra());
        System.out.printf("Valor unitário do Ponto de Equilíbrio %.3f\n", venda.unitarioPontoEqVenda());
        System.out.printf("Valor total do Ponto de Equilíbrio %.3f\n", venda.totalPontoEqVenda());
        System.out.printf("Valor da Unitário da Venda: %.3f\n", venda.valorUnitarioVenda());
        System.out.printf("Valor Total da Venda: %.3f", venda.valorTotalVenda());


        scan.close();

    }
}
