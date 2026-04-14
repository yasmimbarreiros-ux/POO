package atv01_HerancaSimples;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos", 40);

        pessoa1.setNome("Carlos");
        pessoa1.setIdade(40);

        Professor professor1 = new Professor("Carlos",40, "História");
        professor1.setIdade(40);
        professor1.setNome("Carlos");
        professor1.setDisciplina("Programação");

        pessoa1.apresentar();
        professor1.ensinar();

















    }
}
