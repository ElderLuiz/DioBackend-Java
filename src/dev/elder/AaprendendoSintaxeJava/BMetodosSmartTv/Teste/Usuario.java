package dev.elder.AaprendendoSintaxeJava.BMetodosSmartTv.Teste;

import dev.elder.AaprendendoSintaxeJava.BMetodosSmartTv.dominio.SmartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Canal Antigo: " + smartTv.getCanal());

        smartTv.mudarCanal(18);
        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada ? " + smartTv.isLigada());
        System.out.println("Volume Atual ?" + smartTv.getVolume());

        smartTv.Ligar();
        System.out.println("Nono Status -> TV Ligada ?" + smartTv.isLigada());

        smartTv.Desligar();
        System.out.println("Nono Status -> TV Ligada ?" + smartTv.isLigada());

        ;
    }
}
