package dev.elder.EDesafioDioControleFluxo.Excecao;


public class ParametrosInvalidos extends Exception {
    public ParametrosInvalidos(){
        super("O 2° parâmetro deve ser maior que o primeiro");
    }

}
