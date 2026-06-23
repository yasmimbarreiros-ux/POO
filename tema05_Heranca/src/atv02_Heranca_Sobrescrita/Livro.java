package atv02_Heranca_Sobrescrita;

public class Livro extends MaterialBibliografico{

    private String autor;
    private String ISBN;

    public  Livro(String titulo, String codigo, String autor, String ISBN) {
        super(codigo, titulo);
        this.autor = autor;
        this.ISBN = ISBN;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void emprestar(){
        //lógica de emprestimo aqui do livro
        super.emprestar();
        System.out.println("Livro Emprestado superclasse: " +this.titulo);
    }








}
