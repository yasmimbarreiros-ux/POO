public class Flor {

    //atributos

    private String nome;
    private String cor;
    private boolean possuiPerfume;

    //construtores da classe
    public Flor(){
        this.nome = nome;
        this.cor = cor;
        this.possuiPerfume = true;
    }

    // métodos de encapsulamento
    public void setNome(String nome) {
        this.nome = nome;
    }
   public String getNome(){
       return nome;
   }
   public void setCor(String cor) {
        this.cor = cor;
   }
   public String getCor(){
        return cor;
   }
   public boolean setPossuiPerfume(boolean possuiPerfume) {
        this.possuiPerfume = possuiPerfume;
       return possuiPerfume;
   }
   public boolean getPossuiPerfume(){
        return possuiPerfume;
   }

    //métodos de négocio
    void mostrarDados(){
        System.out.println("Nome da flor: " + getNome());
        System.out.println("Cor da flor: " + getCor());

         if (possuiPerfume){
             System.out.println("Possui perfume: sim");
         }else  {
             System.out.println("Possui perfume: não");
         }
    }

    }








