package ControleDeTarefas;

public class Main {
    public static void main(String[] args) {


        ListaTarefas lista =  new ListaTarefas();

        Tarefa t1 = new Tarefa("Estudar Java");
        Tarefa t2 = new Tarefa("Fazer atividade de POO");
        Tarefa t3 = new Tarefa("Revisar conteúdo da aula");

        lista.adicionarTarefa(t1);
        lista.adicionarTarefa(t2);
        lista.adicionarTarefa(t3);

        lista.listarTarefas();

        lista.removerTarefa(t2);

        lista.listarTarefas();















    }
}
