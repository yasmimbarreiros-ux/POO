package atv07_ControleDeEstoque;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Produto p1 = new Produto("Mouse");
        Produto p2 = new Produto("Teclado");
        Produto p3 = new Produto("Monitor");

        estoque.adicionarProduto(1,p1);
        estoque.adicionarProduto(2,p2);
        estoque.adicionarProduto(3,p3);

        System.out.println("=== LISTA DE PRODUTOS ===");
        estoque.listarProdutos();

        System.out.println("\n===BUSCANDO PRODUTO CÓDIGO 2 ===");
        System.out.println("Produto: " + estoque.buscarProduto(2));

        System.out.println("\n=== REMOVENDO PRODUTO CÓDIGO 1 ===");
        estoque.removerProduto(1);

        System.out.println("\n=== LISTA ÁPOS A REMOÇÃO ===" );
        estoque.listarProdutos();

        System.out.println("\n=== EXISTE O CÓDIGO 3? ===");
        System.out.println(estoque.verificarCodigo(3));

        System.out.println("\n=== QUANTIDADE DE PRODUTOS ===");
        System.out.println(estoque.quantidadeProdutos());

        System.out.println("\n=== ESTOQUE ESTÁ VAZIO? ===");
        System.out.println(estoque.estoqueVazio());

    }

}
