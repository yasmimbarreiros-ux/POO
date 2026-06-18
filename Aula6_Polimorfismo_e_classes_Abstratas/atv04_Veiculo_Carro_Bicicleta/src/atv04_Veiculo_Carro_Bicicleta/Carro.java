package atv04_Veiculo_Carro_Bicicleta;

 class Carro extends Veiculo {

     public Carro (String modelo){
         super (modelo);
     }

     @Override
     public void mover() {
         System.out.println("O carro está se movendo com motor");
     }
}
