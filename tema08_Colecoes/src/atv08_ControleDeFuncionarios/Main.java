package atv08_ControleDeFuncionarios;

public class Main {
    public static void main(String[] args) {

        Empresa empresa  = new Empresa();

        Funcionario f1 = new Funcionario("Ana");
        Funcionario f2 = new Funcionario("Marina");
        Funcionario f3 = new Funcionario("Carlos");

        empresa.adicionarFuncionario(1,f1);
        empresa.adicionarFuncionario(2,f2);
        empresa.adicionarFuncionario(3,f3);

        System.out.println("=== LISTA DE FUNCIONÁRIOS ===");
        empresa.listarFuncionarios();

        System.out.println("\n=== BUSCANDO FUNCIONÁRIO CÓDIGO 2 ===");
        System.out.println("Funcionário: " + empresa.buscarFuncionario(2));

        System.out.println("\n=== PRIMEIRA CHAVE ===");
        System.out.println(empresa.primeiraChave());

        System.out.println("\n=== ÚLTIMA CHAVE ===");
        System.out.println(empresa.ultimaChave());

        System.out.println("\n=== REMOVENDO FUNCIONÁRIO CÓDIGO 1 ===");
        empresa.removerFuncionario(1);

        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        empresa.listarFuncionarios();

        System.out.println("\n=== EXISTE O CÓDIGO 3? ===");
        System.out.println(empresa.verificarCodigo(3));

        System.out.println("\n=== QUANTIDADE DE FUNCIONÁRIOS ===");
        System.out.println(empresa.quantidadeFuncionarios());

        System.out.println("\n=== EMPRESA ESTÁ VAZIA? ===");
        System.out.println(empresa.empresaVazia());
    }
}


