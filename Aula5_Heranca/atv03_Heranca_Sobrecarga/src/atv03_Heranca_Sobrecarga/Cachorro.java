package atv03_Heranca_Sobrecarga;

public class Cachorro  extends Animal {

    private String porte;
    public Cachorro(String nome, int idade, String porte){
        super(nome, idade);
        this.porte = porte;
    }
    public String getPorte(){
        return porte;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }
    public void correr( ){
        System.out.println(nome + " está Correndo");
    }
    public void correr (int distancia){
        System.out.println(nome + " correu" +  distancia  + " metros");
    }
}
