package atv03_Heranca_Sobrecarga;

public class Animal {
    protected String nome;
    protected int idade;
    //construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println(nome +"  está emitindo um som.");
    }
    public void emitirSom(String som){
        System.out.println(nome + " faz:  " + som);
    }
}


