package atv01_Animal_Gato_Vaca_Papagaio;

public class Papagaio extends Animal {

    private String corPenas;

    public Papagaio(String nome, String corPenas) {
        super(nome);
        this.corPenas = corPenas;
    }
    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    public String getCorPenas() {
        return corPenas;
    }

    @Override
    public void mover() {
        System.out.println(nome + "Voando pelos céus!");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Curupaco!");
    }

    public void emitirSom(String frase){
        System.out.println(nome + " repete:" + frase);
    }








}
