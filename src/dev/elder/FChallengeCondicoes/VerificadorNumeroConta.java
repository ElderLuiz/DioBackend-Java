package dev.elder.FChallengeCondicoes;
import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta bancária:");

        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Número de conta inválido. Digite exatamente 8 dígitos.");
        } finally {
            scanner.close();
        }
    }

    public static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8) {
            throw new IllegalArgumentException();
        }
        // Verificação adicional, se necessário
    }
}
