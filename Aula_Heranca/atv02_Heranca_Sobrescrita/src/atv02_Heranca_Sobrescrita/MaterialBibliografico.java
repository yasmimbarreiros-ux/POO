package atv02_Heranca_Sobrescrita;

public class MaterialBibliografico {
    protected String codigo;
    protected String titulo;

    public MaterialBibliografico(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
     public void emprestar(){
       System.out.println("Livro Emprestado da clase Base Material bibliográfico" +getTitulo());
   }




}
