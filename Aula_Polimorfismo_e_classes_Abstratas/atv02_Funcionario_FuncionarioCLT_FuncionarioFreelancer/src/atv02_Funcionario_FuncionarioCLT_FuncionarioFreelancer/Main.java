package atv02_Funcionario_FuncionarioCLT_FuncionarioFreelancer;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioCLT("ANA", 3000);
        Funcionario f2 = new FuncionarioFreelancer("CARLOS", 40, 50);

        System.out.println("Salário de " + f1.nome+ ":" + f1.calcularSalario());
        System.out.println("Salário de " + f2.nome+ ":" + f2.calcularSalario());
    }
}
