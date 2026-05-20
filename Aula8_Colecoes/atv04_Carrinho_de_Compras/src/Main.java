public class Main {

    public static void main(String[] args) {


        Carrinho carrinho = new Carrinho();

        Produto p1 = new Produto("Arroz", 25.90);
        Produto p2 = new Produto("Feijão", 8.50);
        Produto p3 = new Produto("Macarrão", 6.99);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.listarProdutos();
        carrinho.removerProduto(p2);

        carrinho.listarProdutos();
        carrinho.mostrarQuantidade();

    }
}