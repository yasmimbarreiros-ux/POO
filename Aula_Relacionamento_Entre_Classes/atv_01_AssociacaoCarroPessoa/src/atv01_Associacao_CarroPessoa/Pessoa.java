package atv01_Associacao_CarroPessoa;


import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;

    private ArrayList<Carro> carrosDirigidos;


    public Pessoa(String nome, String cpf, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.carrosDirigidos = new ArrayList<>();
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    public void setCarrosDirigidos(ArrayList<Carro> carrosDirigidos) {
        this.carrosDirigidos = carrosDirigidos;
    }
    public String getNome() {
        return nome;
    }
    public String getcpf() {
        return cpf;
    }
    public int getidade() {
        return idade;
    }
    public String getsexo() {
        return sexo;
    }
    public ArrayList<Carro> getCarrosDirigidos() {
        return carrosDirigidos;
    }


    public void adicionarCarrosDirigidos(Carro carro) {
        carrosDirigidos.add(carro);
        System.out.println("Carro adicionado com à lista de dirigidos!");
    }
    public void usarCarro(Carro carro) {
        System.out.println(nome + "está usando o carro:");
        carro.dirigir();
    }
    public void listarCarro(){
        System.out.println("Carros dirigidos por:" + nome + ":");

        for (Carro carro : carrosDirigidos) {
            carro.exibirDados();
        }



    }


    public void exibirDados() {

    }
}
