package dev.elder.FChallengeCondicoes;
import java.util.Scanner;

public class ControleSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (;;) {
            System.out.println("Informe o valor do saque (ou digite 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            // Verificar se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            } else {
                // Subtrair o valor do saque do limite diário
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario +"Transações encerradas.");
            }
        }
        scanner.close();
    }
}
