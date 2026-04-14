package atv04_Composicao_PlacaMaeComputador;

public class PlacaMae {

    private String fabricante;
    private String chipset;
    private int numeroDeSlots;
    private String tipoDeMemoriaSuportada;

    public PlacaMae(String fabricante, String chipset, int numeroDeSlots, String tipoDeMemoriaSuportada) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numeroDeSlots = numeroDeSlots;
        this.tipoDeMemoriaSuportada = tipoDeMemoriaSuportada;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    public void setNumeroDeSlots(int numeroDeSlots) {
        this.numeroDeSlots = numeroDeSlots;
    }
    public void setTipoDeMemoriaSuportada(String tipoDeMemoriaSuportada) {
        this.tipoDeMemoriaSuportada = tipoDeMemoriaSuportada;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getChipset() {
        return chipset;
    }
    public int getNumeroDeSlots() {
        return numeroDeSlots;
    }
    public String getTipoDeMemoriaSuportada() {
        return tipoDeMemoriaSuportada;
    }


    public void exibirInformacoes() {
        System.out.println("=== Informações da Placa Mãe ===");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Número de Slots: " + numeroDeSlots);
        System.out.println("Tipo de Memória Suportada: " + tipoDeMemoriaSuportada);
    }

    public void atualizarChipset(String novoChipset) {
        this.chipset = novoChipset;
        System.out.println("Chipset atualizado para: " + novoChipset);
    }

    public void adicionarSlot() {
        this.numeroDeSlots++;
        System.out.println("Slot adicionado. Total de slots: " + numeroDeSlots);
    }

    public void definirTipoMemoria(String tipo) {
        this.tipoDeMemoriaSuportada = tipo;
        System.out.println("Tipo de memória atualizado para: " + tipo);
    }
}


