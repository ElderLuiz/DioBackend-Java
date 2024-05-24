package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Crazy");
        curso1.setDescricao("A Maior loucura da historia");
        curso1.setCargaHoraria(255);


        Curso curso2 = new Curso();
        curso2.setTitulo("Virado no Jiraya");
        curso2.setDescricao("A Maior loucura da programação");
        curso2.setCargaHoraria(361);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Enriquecendo com Java");
        mentoria.setDescricao("Entendendo as linhas de code");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria com MarkZuckerberguer");
        mentoria2.setDescricao("Como pegar ideias e trasmformar em codigos");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootOfDev");
        bootcamp.setDescricao("Oracle");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElder = new Dev();
        devElder.setNome("Elder");
        devElder.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos: "+devElder.getConteudosInscritos());

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudods Inscritos: "+devLucas.getConteudosInscritos());






//        curso1.imprimirCurso();
//        mentoria.imprimirMentoria();







    }
}
