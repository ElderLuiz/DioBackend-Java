package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    private LocalDate data;

    public Mentoria() {

    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public void imprimirMentoria() {
        System.out.println("================ Mentoria ================");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Carga Horária: "+data);
        System.out.println("                                     ");

    }
}
