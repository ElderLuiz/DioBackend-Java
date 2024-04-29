package dev.elder.aprendendoSintaxeJava.AIntroducao;

public class AAnatomiaDasClasses {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Meu Trajeto no BootCamp Backend com Java Realizado pelo Santander junto com a DIO");

        //Começamos vendo sobre o atributo final que é uma propriedade que garante que a variável ou atributo
        //seja inicializado apenas uma vez e que seu valor não possa ser modificado posteriormente.

        final String NOME = "Elder Dev";
        final int IDADE = 21;

        //Estrutura
        //Tipo NomeBemDefinido Atribuição (opcional em alguns casos)
        String primeiroNome = "Elder ";
        String sobreNome = "Luiz";

        String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String sobreNome){
        return primeiroNome + sobreNome;
    }
}