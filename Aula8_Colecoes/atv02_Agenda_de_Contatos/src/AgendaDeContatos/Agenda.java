package AgendaDeContatos;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
        System.out.println("Contato removido: " + contato.getNome());
    }

    public void listarContatos() {
        System.out.println("\nLista de contatos");

        for (Contato contato : contatos) {
            System.out.println("- " + contato.getNome());
        }
    }
}










