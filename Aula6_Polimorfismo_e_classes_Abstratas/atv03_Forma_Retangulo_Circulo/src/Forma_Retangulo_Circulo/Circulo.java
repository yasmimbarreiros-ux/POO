package Forma_Retangulo_Circulo;

class Circulo extends Forma {

    double raio;

    public Circulo(String nome, double raio) {
       super(nome);
        this.raio = raio;

    }
    @Override
    public double calcularArea() {
        return 3.14 * raio*raio;
    }
}
