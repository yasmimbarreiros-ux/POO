package atv07_ControleDeEstoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private HashMap<Integer, Produto> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }
    public void adicionarProduto(Integer codigo, Produto produto) {
        produtos.put(codigo, produto);
    }
    public Produto buscarProduto(Integer codigo) {
        return produtos.get(codigo);
    }
    public void removerProduto(Integer codigo) {
        produtos.remove(codigo);
    }
    public boolean verificarCodigo(Integer codigo) {
        return produtos.containsKey(codigo);
    }
    public int quantidadeProdutos() {
        return produtos.size();
    }
    public boolean estoqueVazio() {
        return produtos.isEmpty();
    }
    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {

            for (Map.Entry<Integer, Produto> item : produtos.entrySet()) {

                System.out.println("Código: " + item.getKey() + " | Produto: " + item.getValue()
                );
            }
        }
    }
}

