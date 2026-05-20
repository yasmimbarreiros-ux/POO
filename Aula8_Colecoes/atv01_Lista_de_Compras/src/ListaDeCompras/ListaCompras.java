package ListaDeCompras;

import java.util.ArrayList;

public class ListaCompras {

    private final ArrayList<Item> lista;

    public ListaCompras() {
        this.lista = new ArrayList<>();
    }
    public void adicionarItem(Item item) {

        lista.add(item);
        System.out.println("Item Adicionado: " + item.getNome());

    }
    public void removerItem(Item item) {
        lista.remove(item);

        System.out.println("Item Removido: " + item.getNome());

    }
    public void mostrarItems() {
        System.out.println("Lista de Compras: ");
        for (Item item : lista) {
            System.out.println(item.getNome());
        }

    }

}
