package Forma_Retangulo_Circulo;

public class Main {
    public static void main(String[] args) {

        Forma f1 = new Circulo("Círculo", 3);
        Forma f2 = new Retangulo("RETANGULO", 5, 4);


        System.out.println("Área do " + f1.nome + ": " + f1.calcularArea());
        System.out.println("Área do " + f2.nome + ": " + f2.calcularArea());


    }
}
