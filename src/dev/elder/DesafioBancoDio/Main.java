package dev.elder.DesafioBancoDio;

public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        Conta cc = new ContaCorrente(luiz);
        Conta contaPoupanca = new ContaPoupanca(luiz);



        luiz.setNome("Luiz");
        luiz.setIdade(25);
        luiz.setSexo("Masculino");

        cc.depositar(1000);

        cc.transferir(100,contaPoupanca);


        cc.imprimirInfo();

    }
}
