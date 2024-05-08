package dev.elder.EDesafioDioControleFluxo.Dominio;
import dev.elder.EDesafioDioControleFluxo.Excecao.ParametrosInvalidos;

import java.util.Scanner;



public class Contador {

    public static void main(String[] args) {
        // TODO: 08/05/2024 O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
        //  com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console
        //  (System.out.print) dos números incrementados, exemplo: Se você passar os números 12 e 30,
        //  logo teremos uma interação (for) com 18 ocorrências para imprimir os números,
        //  exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
        //  Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada
        //  chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro."
        Scanner input = new Scanner(System.in);

        System.out.println("                 Desafio Controle de fluxo                 ");
        System.out.println("Digite dois valores para saber o número de interações entre eles.");
        System.out.println("1º valor: ");
        int paramentro1 = lerInteiro(input);

        System.out.println("2º valor: ");
        int paramentro2 = lerInteiro(input);

        try{
            contar(paramentro1, paramentro2);
        }catch (ParametrosInvalidos e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidos();
        }else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) {
                System.out.println("Imprimindo a " + i + "ª interação: " + i);
            }
        }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }

}

