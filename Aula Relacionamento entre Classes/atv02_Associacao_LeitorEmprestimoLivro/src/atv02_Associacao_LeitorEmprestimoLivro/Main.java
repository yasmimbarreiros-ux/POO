package atv02_Associacao_LeitorEmprestimoLivro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
       leitor.setNome("Maria Silva");
       leitor.setMatricula("2021001");
       leitor.setEmail("maria.silva.com.br");
       leitor.setTelefone("(94) 99225-7943");

       Livro livro = new Livro();
       livro.setTitulo("O pequeno Principe");
       livro.setAutor("Antoine de Sint-Exupéry");
       livro.setIsbn("978-3-16-14-8410-0");
       livro.setEmprestado(false);

       LocalDate dateRetirada  = LocalDate.now();
       LocalDate dataDevolucao = dateRetirada.plusDays(7);

       Emprestimo emprestimo = new Emprestimo(livro, leitor, dateRetirada, dataDevolucao);

       LocalDate hoje = LocalDate.now();

       emprestimo. exibirResumo();

       System.out.println("\nEmprestimo Atrasado.");
       if(emprestimo.estaAtrasado(hoje)){
           System.out.println("Emprestimo Atrasado");
       } else{
           System.out.println("Não, está no prazo");
       }
       emprestimo.devolverLivro();

       System.out.println("\nStatus final do livro:");
       if(livro.isEmprestado()){
           System.out.println("Emprestado.");
       } else{
           System.out.println("o livro esta disponivel.");
       }

    }
}