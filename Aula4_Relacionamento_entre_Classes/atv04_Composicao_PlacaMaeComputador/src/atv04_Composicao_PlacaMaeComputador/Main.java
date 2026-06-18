package atv04_Composicao_PlacaMaeComputador;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador(
                "Dell",
                "Inspiron 15",
                "Intel Core i5",
                8,
                "ASUS",
                "B560",
                4,
                "DDR4"
        );
        pc1.exibirComputadorCompleto();

        System.out.println("\nAtualizações em andamento...\n");

        pc1.atualizarProcessador("Intel Core i7");
        pc1.expandirMemoria(8);
        pc1.atualizarPlacaMae("Z590", "DDR5");

        System.out.println("\nInformações após atualização:\n");
        pc1.exibirComputadorCompleto();
    }
}