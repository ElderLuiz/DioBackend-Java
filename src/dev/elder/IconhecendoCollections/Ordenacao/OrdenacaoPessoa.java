package dev.elder.IconhecendoCollections.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa>pessoaList;


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adcionarPessoa("Julio", 25,1.78);
        ordenacaoPessoa.adcionarPessoa("Maria", 29,1.50);
        ordenacaoPessoa.adcionarPessoa("Maria J", 20,1.60);
        ordenacaoPessoa.adcionarPessoa("Kaio", 23,1.69);
        ordenacaoPessoa.adcionarPessoa("Bruno", 19,1.80);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }

}
