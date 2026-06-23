package atv01_ListaDeCompras;

public class Main {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        Item Item1 = new Item("Carne");
        Item Item2 = new Item("Arroz");
        Item Item3 = new Item("Feijão");
        Item Item4 = new Item("Farinha");

        lista.adicionarItem(Item1);
        lista.adicionarItem(Item2);
        lista.adicionarItem(Item3);
        lista.adicionarItem(Item4);


        lista.removerItem(Item3);
        lista.mostrarItems();

    }
}
