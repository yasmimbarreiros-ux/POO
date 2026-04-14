public class Gato {
    //atributos
    String nome;
    int qtdComidaDisponivel;
    boolean sono;
    boolean sede;

    //construtores
    public Gato(String nome, int qtdComidaDisponivel,  boolean sono) {
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
        this.sede = false;
    }

    //métodos
    void dormir(){
        sono = false;
        System.out.println("Dormir");
    }
    void comer(){
        qtdComidaDisponivel -=1;
        System.out.println(nome + "comeu. Comida restante"  +  qtdComidaDisponivel);
    }
    void beberAgua(){
        sede = false;
        System.out.println(nome + "beberAgua.");
    }
}
