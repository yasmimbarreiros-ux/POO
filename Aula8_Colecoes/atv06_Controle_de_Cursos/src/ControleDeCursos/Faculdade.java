package ControleDeCursos;
import java.util.LinkedList;

public class Faculdade {

    private LinkedList<Curso> cursos = new LinkedList<>();

    public void  adicionarCurso(Curso curso){
        cursos.add(curso);

    }
    public void listarCurso(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    public void mostrarPrimeiroCurso(){
        System.out.println(cursos.getFirst());
    }
    public void mostrarUltimoCurso(){
        System.out.println(cursos.getLast());
    }
    public void removerPrimeiroCurso(){
        cursos.removeFirst();
    }
    public void mostrarQuantidadeCursos(){
        System.out.println(cursos.size());
    }
    public void verificarListaVazia(){
        System.out.println(cursos.isEmpty())
        ;
    }




}
