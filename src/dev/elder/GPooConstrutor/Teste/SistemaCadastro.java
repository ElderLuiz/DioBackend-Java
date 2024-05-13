package dev.elder.GPooConstrutor.Teste;

import dev.elder.GPooConstrutor.Dominio.Pessoa;

public class SistemaCadastro {
    
        public static void main(String[] args) {
            //criamos uma pessoa no sistema
            Pessoa marcos = new Pessoa("Lucas","075.251.751.92", "RUA DAS MARIAS");


            //imprimindo o marcos sem o nome e cpf

            System.out.println("Nome: "+marcos.getNome() + " "+"Cpf" + marcos.getCpf()+" Endereço "+marcos.getEndereco());
        }
    }


