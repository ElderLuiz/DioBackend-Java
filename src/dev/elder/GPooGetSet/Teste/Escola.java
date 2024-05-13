package dev.elder.GPooGetSet.Teste;

import dev.elder.GPooGetSet.Dominio.Aluno;

public class Escola {
    Aluno aluno = new Aluno();
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Mayco");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }
}

