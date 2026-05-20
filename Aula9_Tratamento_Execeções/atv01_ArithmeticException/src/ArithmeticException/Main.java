package ArithmeticException;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(100.0, 500.0);

        try {
            conta.deposita(-50.0);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            conta.deposita(0.0);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            conta.deposita(200.0);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo atual: R$  " + conta.getSaldo());





    }



}
