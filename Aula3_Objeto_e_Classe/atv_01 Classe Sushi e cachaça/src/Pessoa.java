public class Pessoa {
    //atributos

    private String nome;
    private int idade;

    //construtores da classe

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }



    //métodos de encapsulamento

     public void setNome(String nome){
        this.nome = nome;
     }
     public String getNome(){
        return nome;
     }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    //métodos de négocio

    void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }



}
