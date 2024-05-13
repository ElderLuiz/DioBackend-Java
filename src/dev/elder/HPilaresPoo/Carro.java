package dev.elder.HPilaresPoo;

public class Carro {
    public void ligar(){
        conferirCinto();
        confereGasosa();
        System.out.println("Carro Ligado");
    }
    private void conferirCinto(){
        System.out.println("Conferindo cintos de Segurança");
    }
    private void confereGasosa(){
        System.out.println("Conferindo Combustível");
    }
}
