package atv01_PresencaRegistravel;

public abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
    }

    public abstract void exibirdados();
}
