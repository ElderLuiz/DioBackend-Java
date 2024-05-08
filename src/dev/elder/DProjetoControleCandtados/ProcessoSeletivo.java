package dev.elder.DProjetoControleCandtados;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"felipe","marcia","Julia","Paulo","Augusto"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    print();

    }static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");


    }


    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void print(){
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de Candidatos");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println(" O candidato de Nº "+ indice+ " é "+candidatos[indice]);
        }
    }
    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println(" LIGAR PARA O CANDIDATO ");
        } else if (salarioBase == salarioPretendido) {
            System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA ");
        } else System.out.println(" AGUARDANDO O RESULTADO DOS OUTROS CANDIDATOS ");


    }
}


