package dev.elder.AaprendendoSintaxeJava.AIntroducao;

public class COperadores {
    public static void main(String[] args) {

        int numero = 5;
        int numero1 = 5;
        int a,b;
        numero = -numero;
        System.out.println(numero);

        // numero1  = numero1 + 3;
        numero1++;
        System.out.println(numero1);

        //Ternario

        a = 3;
        b = 6;
        String resultado = a == b ?"Verdadeiro" : "Falso";

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE

        System.out.println(resultado);

        int number = 3;
        int number1 = 3;

        boolean yesNo = number1 == number1;
        System.out.println("O numero 1 é igual ao numero 2 "+yesNo);


    }
}