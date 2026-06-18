package atv01_PresencaRegistravel;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("Carlos", "Administração");
        Professor professor = new Professor("Ana", "Matemática");
        Secretaria secretaria = new Secretaria("Bruna", "Manhã");
        Terceirizado terceirizado = new Terceirizado("José");

        diretor.exibirDados();
        diretor.tomarDecisao();

        professor.exibirDados();
        professor.lecionar();
        professor.registrarPresenca();

        secretaria.exibirDados();
        secretaria.organizarDocumentos();
        secretaria.registrarPresenca();

        terceirizado.executarServico();
        terceirizado.registrarPresenca();
    }
}