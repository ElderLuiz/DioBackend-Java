package dev.elder.aprendendoSintaxeJava.CEscopo;

public class Escopo {
    public void soma(){
        int resultado;
        int numero = 1;
        int numero2 = 5;
     resultado = numero + numero2;
    }
    public void escopo(){
        // Não consigo acessa a variavel resultado aqui dentro do metodo pois ele pertence ao outro metodo
        // System.out.println(resultado);
    }
}
