package atv08_ControleDeFuncionarios;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}
