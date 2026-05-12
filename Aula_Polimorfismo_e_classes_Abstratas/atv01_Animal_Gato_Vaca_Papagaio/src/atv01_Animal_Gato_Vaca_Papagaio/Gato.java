package atv01_Animal_Gato_Vaca_Papagaio;

public  class Gato extends Animal {
    private boolean castrado;


    public Gato(String nome, boolean castrado) {
        super(nome);
        this.castrado = castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public boolean getCastrado() {
        return this.castrado;
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz:  Miau!");
    }

    @Override
    public void mover() {
    System.out.println(nome + ": Saltando agilmente ");
    }
}


