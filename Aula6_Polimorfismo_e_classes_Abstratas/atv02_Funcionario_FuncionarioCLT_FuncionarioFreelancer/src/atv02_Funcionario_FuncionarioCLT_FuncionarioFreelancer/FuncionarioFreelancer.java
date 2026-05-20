package atv02_Funcionario_FuncionarioCLT_FuncionarioFreelancer;

  class FuncionarioFreelancer extends Funcionario {

     double horasTrabalhadas;
     double valorHora;

     public FuncionarioFreelancer(String nome, double horasTrabalhadas, double valorHora) {
         super(nome);
         this.horasTrabalhadas = horasTrabalhadas;
         this.valorHora = valorHora;
     }

     public void setHorasTrabalhadas(double horasTrabalhadas) {
         this.horasTrabalhadas = horasTrabalhadas;
     }
     public double getHorasTrabalhadas() {
         return horasTrabalhadas;
     }
     public void setValorHora(double valorHora) {
         this.valorHora = valorHora;
     }
     public double getValorHora() {
         return valorHora;
     }
     @Override
      public double calcularSalario() {
         return horasTrabalhadas * valorHora;
     }

 }
