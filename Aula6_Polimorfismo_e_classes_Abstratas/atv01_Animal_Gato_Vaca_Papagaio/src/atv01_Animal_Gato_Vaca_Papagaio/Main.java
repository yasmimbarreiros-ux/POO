package atv01_Animal_Gato_Vaca_Papagaio;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Gato("Amendoina", false);
        Animal a2 = new Papagaio("Louro", "Verde");
        Animal a3 = new Vaca("Caracura", "123");

        Animal[] animals = {a1, a2, a3};

        System.out.println("=== Demonstração de Polimorfismo ===");

        for (Animal animal : animals) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }

        System.out.println("=== Demonstração de Sobrecarga ===");

        Papagaio papagaio = new Papagaio("Loro", "Verde");
        papagaio.emitirSom(" Olá humanos!");
    }
}