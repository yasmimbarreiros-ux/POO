package atv09_ControleDeClientes;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Cliente c1 = new Cliente("Ana");
        Cliente c2 = new Cliente("Carlos");
        Cliente c3 = new Cliente("Marina");
        Cliente c4 = new Cliente("Maria");

        loja.adicionarCliente(c1);
        loja.adicionarCliente(c2);
        loja.adicionarCliente(c3);
        loja.adicionarCliente(c4);

        System.out.println("=== LISTA DE CLIENTES ===");
        loja.listarClientes();

        System.out.println("\n=== QUANTIDADE DE CLIENTES ===");
        System.out.println(loja.quantidadeClientes());

        System.out.println("\n=== CLIENTE ANA EXISTE? ===");
        System.out.println(loja.verificarCliente(c3));

        System.out.println("\n=== REMOVENDO CLIENTE CARLOS ===");
        loja.removerCliente(c2);

        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        loja.listarClientes();

        System.out.println("\n=== A LOJA ESTÁ VAZIA? ===");
        System.out.println(loja.lojaVazia());
    }

}
