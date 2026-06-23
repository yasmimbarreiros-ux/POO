package atv03_Heranca_Sobrecarga;

public class Gato extends Animal {
    private String corPelagem;
    public Gato(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }
    public String getCorPelagem() {
        return corPelagem;
    }
    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }
    public void brincar(){
        System.out.println(nome + "  está brincando");
    }
    public void brincar(String brinquedo){
        System.out.println(nome +"  está brincando com" + brinquedo);
    }
}
