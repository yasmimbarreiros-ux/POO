package ArithmeticException;

public class Conta {

    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void deposita(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: o valor do depósito deve ser maior que zero. ");
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

}
