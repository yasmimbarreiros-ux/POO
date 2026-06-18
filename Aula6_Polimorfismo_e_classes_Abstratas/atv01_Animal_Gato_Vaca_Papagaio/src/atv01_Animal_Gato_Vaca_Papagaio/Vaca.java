package atv01_Animal_Gato_Vaca_Papagaio;

public class Vaca extends Animal{

    private String numeroBrinco;

    public Vaca(String nome, String numeroBrinco) {
        super(nome);
        this.numeroBrinco = numeroBrinco;
    }
    public String getCorPenas() {
        return numeroBrinco;
    }
    public void setCorPenas(String numeroBrinco) {
        this.numeroBrinco = numeroBrinco;
    }
    @Override
    public void mover() {
        System.out.println(nome + " Andando pelo pasto!");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome + " diz: Muuu!");

    }

}
