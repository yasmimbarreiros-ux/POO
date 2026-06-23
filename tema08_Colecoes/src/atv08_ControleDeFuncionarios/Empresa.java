package atv08_ControleDeFuncionarios;
import java.util.TreeMap;
import java.util.Map;
public class Empresa {
    private  TreeMap<Integer, Funcionario> funcionarios;
    public Empresa() {
        funcionarios = new TreeMap<>();
    }

    public void adicionarFuncionario(Integer codigo, Funcionario funcionario) {
        funcionarios.put(codigo, funcionario);
    }

    public Funcionario buscarFuncionario(Integer codigo) {
        return funcionarios.get(codigo);
    }

    public void removerFuncionario(Integer codigo) {
        funcionarios.remove(codigo);
    }

    public boolean verificarCodigo(Integer codigo) {
        return funcionarios.containsKey(codigo);
    }

    public Integer primeiraChave() {
        return funcionarios.firstKey();
    }

    public Integer ultimaChave() {
        return funcionarios.lastKey();
    }

    public int quantidadeFuncionarios() {
        return funcionarios.size();
    }

    public boolean empresaVazia() {
        return funcionarios.isEmpty();
    }

    public void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.println("Empresa vazia!");
        } else {

            for (Map.Entry<Integer, Funcionario> item : funcionarios.entrySet()) {

                System.out.println(
                        "Código: " + item.getKey() +
                                " | Funcionário: " + item.getValue()
                );
            }
        }
    }
}


