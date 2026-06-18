package atv02_Heranca_Sobrescrita;

public class Main {
    public static void main(String[] args) {
        //Testando a Herança
        Livro livro = new Livro("Engenharia de Software", "A25","Pressman", "A1");
        livro.emprestar();
        Revista revista = new Revista("AOO", "B20", "12/2024");
        revista.emprestar();

        MidiaDigital midia = new MidiaDigital("TCC", "AA","pdf", 20.5);
        midia.emprestar();
    }
}
