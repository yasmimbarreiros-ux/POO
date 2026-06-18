package ArithmeticException;
public class Main {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;

        try{
            int resultado = n1 / n2;
            System.out.println("Resultadp: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
    }
}
