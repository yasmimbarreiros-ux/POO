package atv01_Associacao_CarroPessoa;

public class Carro {

    private String modelo;
    private String placa;
    private String cor;
    private double velocidadeAtual;


    public Carro(String modelo, String placa, String cor, double velocidadeAtual) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.velocidadeAtual = 0;

    }
    public void setModelo(){
         this.modelo = modelo;
    }
    public void setPlaca(){
        this.placa = placa;
    }
    public void setCor(){
        this.cor = cor;
    }
    public void setVelocidadeAtual(){
        this.velocidadeAtual = velocidadeAtual;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getCor(){
        return this.cor;
    }
    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public void dirigir(){
        System.out.println("Dirindo o carro modelo:" + modelo);

    }
    public void acelerar(double valor){
        velocidadeAtual += valor;
        System.out.println("Acelerando...Velocidade atual:" +  velocidadeAtual);

    }
    public void frear(double valor){
        velocidadeAtual -= valor;

        if(velocidadeAtual < 0){
            velocidadeAtual = 0;
        }
        System.out.println("Freando...Velocidade atual:" +  velocidadeAtual);

    }
    public void exibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }





}
