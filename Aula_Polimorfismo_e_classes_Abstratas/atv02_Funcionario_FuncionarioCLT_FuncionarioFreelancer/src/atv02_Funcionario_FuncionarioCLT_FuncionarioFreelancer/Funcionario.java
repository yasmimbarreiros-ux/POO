package atv02_Funcionario_FuncionarioCLT_FuncionarioFreelancer;

abstract class Funcionario {

    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    public abstract double calcularSalario();

}
