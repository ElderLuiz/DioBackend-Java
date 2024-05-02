package dev.elder.aprendendoSintaxeJava.FContaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int conta;
        String agencia,nomeCliente;
        double saldo;

        System.out.println("------------------ CONTA BANCÁRIA SANTANDER ------------------");
        System.out.println("Digite o número da sua Conta, Ex: 1541 | Qualquer Dúvida peça ajuda para o Suporte Interno do Banco ");
        System.out.println("Querido Cliente, Por favor digite o número da sua Conta: ");
        conta = print.nextInt();

        System.out.println("Digite o número da sua Agência, Ex: 123-8 | Qualquer Dúvida peça ajuda para o Suporte Interno do Banco ");
        System.out.println("Digite o número da sua Agência: ");
        agencia = print.next();

        System.out.println("Informe seu nome: ");
        nomeCliente = print.next();
        print.nextLine();

        System.out.println("Informa seu saldo atual: ");
        saldo = print.nextDouble();

        System.out.println("------------------ DADOS CLIENTE SANTANDER ------------------");
        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta no Santander");
        System.out.println(" Sua agência: "+agencia);
        System.out.println(" Sua conta: "+conta);
        System.out.println(" Seu saldo atual disponível: "+saldo);


        print.close();
    }

}

