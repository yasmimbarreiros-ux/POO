package atv02_Heranca_Sobrescrita;

public class MidiaDigital extends MaterialBibliografico{

    private String formatoArquivo;
    private double tamanhoMb;
    private int totalDownloads;

    public MidiaDigital(String titulo, String codigo, String formatoArquivo, double tamanhoMb){
        super(titulo,codigo);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoMb = tamanhoMb;
        this.totalDownloads = 0;
    }
    public String getFormatoArquivo() {
        return formatoArquivo;
    }
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    public double getTamanhoMb() {
        return tamanhoMb;
    }
    public void setTamanhoMb(double tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }
    public int getTotalDownloads() {
        return totalDownloads;
    }
    public void setTotalDownloads(int totalDownloads) {
        this.totalDownloads = totalDownloads;
    }
    public void emprestar(){
        super.emprestar();
        System.out.println("Midia Digital Emprestado da classe derivada Midia Digital: " + getTitulo()+"quantidade de dowloads: " +getTotalDownloads());
    }
}