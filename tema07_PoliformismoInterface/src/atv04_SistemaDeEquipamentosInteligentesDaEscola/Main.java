package atv04_SistemaDeEquipamentosInteligentesDaEscola;

public class Main {
    public static void main(String[] args) {

        Ligavel equipamento = new ProjetorInteligente();

        equipamento.ligar();

        Conectavel internet = new ProjetorInteligente();
        internet.conectarInternet();
    }
}
