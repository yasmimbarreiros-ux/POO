package ControleDeCursos;

public class Main {
    public static void main(String[] args) {

        Faculdade faculdade = new Faculdade();

        faculdade.adicionarCurso(new Curso("Engenharia"));
        faculdade.adicionarCurso(new Curso("Direito"));
        faculdade.adicionarCurso(new Curso("Computação"));
        faculdade.adicionarCurso(new Curso("Psicologia"));

        System.out.println("\n=== Lista de Cursos ===");
        faculdade.listarCurso();

        System.out.println("\n=== Primeiro Curso  ===");
        faculdade.mostrarPrimeiroCurso();

        System.out.println("\n=== Ultimo Curso ===");
        faculdade.mostrarUltimoCurso();

        System.out.println("\n=== REMOVENDO PRIMEIRO CURSO ===");
        faculdade.removerPrimeiroCurso();

        System.out.println("\n=== Quantidade de Cursos ===");
        faculdade.listarCurso();

        System.out.println("\n=== A Lista Está Vazia? ===");
        faculdade.verificarListaVazia();





    }


}
