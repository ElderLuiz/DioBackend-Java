package dev.elder.IconhecendoCollections.ListaTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    public void adcionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
            List<Tarefa> tarefasParaRemover = new ArrayList<>();
            for (Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total na lista é: "+listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adcionarTarefa("Tomar Café");
        listaTarefas.adcionarTarefa("Almoçar");
        listaTarefas.adcionarTarefa("Almoçar");

        System.out.println("O numero total na lista é: "+listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.obterDescricoesTarefas();

    }
}
