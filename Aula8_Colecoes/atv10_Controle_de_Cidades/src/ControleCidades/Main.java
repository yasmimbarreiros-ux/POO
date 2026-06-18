package ControleCidades;

public class Main {
    public static void main(String[] args) {

        Estado estado = new Estado();

        Cidade cidade1 = new Cidade("Marabá");
        Cidade cidade2 = new Cidade("Itupiranga");
        Cidade cidade3 = new Cidade("Parauapebas");

        estado.adicionarCidade(cidade1);
        estado.adicionarCidade(cidade2);
        estado.adicionarCidade(cidade3);

        System.out.println("=== LISTA DE CIDADES ===");
        estado.listarCidades();

        System.out.println("\n=== PRIMEIRA CIDADE ===");
        System.out.println(estado.primeiraCidade());

        System.out.println("\n=== ÚLTIMA CIDADE ===");
        System.out.println(estado.ultimaCidade());

        System.out.println("\n=== VERIFICAR CIDADE ===");
        System.out.println(estado.verificarCidade(cidade1));

        System.out.println("\n=== REMOVENDO CIDADE ===");
        estado.removerCidade(cidade2);

        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        estado.listarCidades();

        System.out.println("\n=== QUANTIDADE DE CIDADES ===");
        System.out.println(estado.quantidadeCidades());

        System.out.println("\n=== ESTADO ESTÁ VAZIO? ===");
        System.out.println(estado.estadoVazio());
    }
}


