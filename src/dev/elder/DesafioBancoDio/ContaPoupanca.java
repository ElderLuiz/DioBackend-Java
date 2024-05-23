package dev.elder.DesafioBancoDio;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

            super.imprimirInfo();

        }


    }

