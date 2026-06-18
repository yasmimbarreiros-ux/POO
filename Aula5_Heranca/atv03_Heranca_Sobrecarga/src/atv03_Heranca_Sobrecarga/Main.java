package atv03_Heranca_Sobrecarga;

public class Main {
    public static void main(String[] args) {


        Gato g1 = new Gato("Amendoina", 6 ,"Preta");
        Cachorro c1 = new Cachorro("Chico", 4,"médio");

        g1.emitirSom();
        g1.emitirSom("Miau");
        c1.emitirSom();
        c1.emitirSom("Au Au");

        g1.brincar();
        g1.brincar("novelo de lã");

        c1.correr();
        c1.correr( 20);
    }
}
