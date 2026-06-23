package atv03_ControleDeTarefas;
import java.util.ArrayList;
public class ListaTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
    }
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada:" + tarefa.getDescricao());
    }
    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.println("Tarefa removida:" + tarefa.getDescricao());
    }
    public void listarTarefas(){
        System.out.println("\nLista de Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println("-" + tarefa.getDescricao());
        }
    }

}
