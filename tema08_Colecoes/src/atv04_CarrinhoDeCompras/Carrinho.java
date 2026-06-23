package atv04_CarrinhoDeCompras;

import java.util.Vector;

public class Carrinho {
    private Vector<Produto> produtos;

    public Carrinho() {
        produtos = new Vector<>();
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() +
                " adicionado ao carrinho.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println(produto.getNome() +
                "  removido do carrinho.");
    }
    public void listarProdutos() {

        System.out.println("\n=== PRODUTOS NO CARRINHO ===");

        for (Produto p : produtos) {
            p.mostrarProduto();
        }
    }
    public void mostrarQuantidade() {
        System.out.println("\nQuantidade de produtos: "
                + produtos.size());
    }
}
