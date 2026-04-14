package atv01_HerancaSimples;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome =  nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade =   idade;
    }
    public int getIdade() {
        return idade;
    }
    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());


    }




}
