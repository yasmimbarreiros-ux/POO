package atv03_SistemaDeControlePortasAutomaticas;

public class Main {
    public static void main(String[] args) {
        PortaAutomatica sala = new PortaSala();
        PortaAutomatica laboratorio = new PortaLaboratorio();

        sala.abrirPorta();
        laboratorio.abrirPorta();


    }
}


