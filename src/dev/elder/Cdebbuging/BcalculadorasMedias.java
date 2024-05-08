package dev.elder.Cdebbuging;

import java.util.Scanner;

public class BcalculadorasMedias {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        String[] alunos = {"Lucas", "Yan", "Symon", "Connor"};

        double media = calculaMediaDaTurma(alunos, print);

        System.out.println("Media da turma "+ media);

    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.println("Nota do aluno "+aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;

    }
}
