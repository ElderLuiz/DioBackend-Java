package dev.elder.AaprendendoSintaxeJava.BMetodosSmartTv.dominio;

public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 29;


    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume para "+volume);
    }

    public void Ligar(){
        ligada = true;
    }
    public void Desligar(){
        ligada = false;
    }


    public boolean isLigada() {
        return ligada;
    }


    public int getCanal() {
        return canal;
    }


    public int getVolume() {
        return volume;
    }


}
