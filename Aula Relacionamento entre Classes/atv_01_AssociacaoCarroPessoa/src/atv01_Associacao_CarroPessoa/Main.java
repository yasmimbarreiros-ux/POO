package atv01_Associacao_CarroPessoa;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat Uno", "SZE-7943", "Vermelho", 4 );

        Pessoa pessoa1 = new Pessoa("Valéria", "043.260.262-35", 23, "Feminino");


        pessoa1.exibirDados();

        pessoa1.usarCarro(carro1);

        carro1.acelerar(23);
        carro1.acelerar(35);

        pessoa1.adicionarCarrosDirigidos(carro1);




    }


}
