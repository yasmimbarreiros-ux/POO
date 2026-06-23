package atv05_ControleDeMercadorias;

public class Mercadoria {
    private String nome;
    public Mercadoria(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Produto: " + nome;
    }
}





