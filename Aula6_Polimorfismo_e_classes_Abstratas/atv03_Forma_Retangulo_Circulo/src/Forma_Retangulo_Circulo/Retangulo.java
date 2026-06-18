package Forma_Retangulo_Circulo;

 class Retangulo extends Forma {

    double base;
    double altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.altura = altura;
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
     public double calcularArea() {
        return base*altura;
    }

}
