package atv03_SistemaDeControlePortasAutomaticas;

public class PortaLaboratorio  implements PortaAutomatica {
    @Override
    public void abrirPorta() {
        System.out.println("Porta do laboratorio aberta.");
    }
}
