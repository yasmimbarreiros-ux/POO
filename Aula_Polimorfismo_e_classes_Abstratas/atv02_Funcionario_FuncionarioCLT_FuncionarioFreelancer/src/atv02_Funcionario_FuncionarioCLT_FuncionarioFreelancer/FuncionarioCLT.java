package atv02_Funcionario_FuncionarioCLT_FuncionarioFreelancer;

 class FuncionarioCLT extends Funcionario {
     double salario;

     public FuncionarioCLT(String nome, double salario) {
         super(nome);
         this.salario = salario;
     }
     @Override
     public double calcularSalario() {
         return salario;
     }



}
