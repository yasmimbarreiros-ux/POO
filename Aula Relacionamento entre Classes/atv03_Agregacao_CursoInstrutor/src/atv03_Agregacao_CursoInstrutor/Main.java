package atv03_Agregacao_CursoInstrutor;

public class Main {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor();
        instrutor1.setNome("Juan");
        instrutor1.setEmail("juan@gmail.com");
        instrutor1.setFormacao("Engenharia da Computação");
        instrutor1.setExperienciaAnos(8);

        Curso curso = new Curso();
        curso.setNome("Programação em Java");
        curso.setCargaHoraria(60);
        curso.setDescricao("Curso focado em lógica, orientação a objetos e práticas com Java.");
        curso.setNivel("Intermediário");

        curso.associarInstrutor(instrutor1);

        curso.exibirCurso();

        instrutor1.aplicarAvaliacao(curso.getNome());
        instrutor1.agendarLive("08/05/2026 às 19h");
    }
}
