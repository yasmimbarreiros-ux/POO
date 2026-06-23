package atv09_ControleDeClientes;
import java.util.HashSet;
public class Loja {
    private HashSet<Cliente> clientes;

    public Loja() {
        clientes = new HashSet<>();
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente.getNome());
    }
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public boolean verificarCliente(Cliente cliente) {
        return clientes.contains(cliente);
    }
    public int quantidadeClientes() {
        return clientes.size();
    }

    public boolean lojaVazia() {
        return clientes.isEmpty();
    }

    public void listarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("Loja vazia!");
        } else {

            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente);
            }
        }
    }
}










