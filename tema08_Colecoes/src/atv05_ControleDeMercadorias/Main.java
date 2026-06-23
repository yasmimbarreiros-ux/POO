package atv05_ControleDeMercadorias;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Mercadoria> pilhaMercadorias = new Stack<>();
        pilhaMercadorias.push(new Mercadoria("Mouse"));
        pilhaMercadorias.push(new Mercadoria("Teclado"));
        pilhaMercadorias.push(new Mercadoria("Monitor"));


        System.out.println("=== ELEMENTOS DA PILHA ===");
        for (Mercadoria mercadoria : pilhaMercadorias) {
            System.out.println(mercadoria);
        }

        System.out.println("=== REMOVENDO ELEMENTO ===");
        Mercadoria removido = pilhaMercadorias.pop();
        System.out.println("Removido:  " + removido);

        System.out.println("\n=== PIlHA APÓS A REMOÇÃO ===");
        for (Mercadoria mercadoria : pilhaMercadorias) {
            System.out.println(mercadoria);
        }

        System.out.println("\n=== QUANTIDADE DE ELEMENTOS ===");

        System.out.println(pilhaMercadorias.size());

        System.out.println("\n=== PILHA ESTÁ VAZIA? ===");

        System.out.println(pilhaMercadorias.empty());

    }
}
