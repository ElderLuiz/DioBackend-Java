package dev.elder.BestruturasCondicionais;

public class BNotaAluno {
    //condicional composta
    public static void main(String[] args) {
        String nomeAluno = "Pedro";
        int nota = 40;
        final int MEDIA = 50;


        if(nota < MEDIA){
            System.out.println(" Reprovado ");

        }else System.out.println(" Aprovado");

        System.out.println("A nota do "+nomeAluno+ " Foi "+nota);

    }
}
