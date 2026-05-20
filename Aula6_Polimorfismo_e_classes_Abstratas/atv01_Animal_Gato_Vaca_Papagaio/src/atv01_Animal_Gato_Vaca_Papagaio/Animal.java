package atv01_Animal_Gato_Vaca_Papagaio;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
    public abstract void mover();

}