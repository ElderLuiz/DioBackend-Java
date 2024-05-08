package dev.elder.BTratamentoExcecoes.BestruturasCondicionais;

public class ACaixaEletronico {
    //Condicional Simples
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 16.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
