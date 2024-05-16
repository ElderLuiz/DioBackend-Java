package dev.elder.IconhecendoCollections.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adcionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adcionarConvidado("Luiza",51);
        conjuntoConvidados.adcionarConvidado("Maria",32);
        conjuntoConvidados.adcionarConvidado("Melissa",98);
        conjuntoConvidados.adcionarConvidado("Camila",25);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
