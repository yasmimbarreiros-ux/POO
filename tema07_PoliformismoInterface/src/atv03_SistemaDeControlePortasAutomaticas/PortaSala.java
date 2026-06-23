package atv03_SistemaDeControlePortasAutomaticas;

public class PortaSala implements PortaAutomatica{

    @Override
    public void abrirPorta() {
        System.out.println("Porta da sala aberta.");
    }
}
