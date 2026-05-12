package atv02_Associacao_LeitorEmprestimoLivro;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro() {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;

    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void exibirInformacoes(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("ISBN: "+isbn);
        System.out.println("Emprestado: "+emprestado);

    }

}
