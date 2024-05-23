package dev.elder.DesafioBancoDio;

public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.setNome("Luiz");

        Conta cc = new ContaCorrente(luiz);
        cc.depositar(100);
        Conta contaPoupanca = new ContaPoupanca(luiz);
        cc.transferir(100,contaPoupanca);

        cc.imprimirInfo();
        contaPoupanca.imprimirInfo();
    }
}
