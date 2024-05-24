package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }





    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void imprimirCurso() {
        System.out.println("================ Curso ================");

        System.out.println("Titulo: "+getTitulo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Carga Horária: "+cargaHoraria);
        System.out.println("                                     ");
    }
}
