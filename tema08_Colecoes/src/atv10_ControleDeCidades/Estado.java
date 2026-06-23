package atv10_ControleDeCidades;

import java.util.TreeSet;

public class Estado {

    private TreeSet<Cidade> cidades;
    public Estado() {
        cidades = new TreeSet<>();
    }
    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }
    public void removerCidade(Cidade cidade) {
        cidades.remove(cidade);
    }
    public boolean verificarCidade(Cidade cidade) {
        return cidades.contains(cidade);
    }
    public void listarCidades() {
        for (Cidade cidade : cidades) {
            System.out.println(cidade.getNome());
        }
    }
    Object primeiraCidade(){
        return cidades.first();
    }
    public Cidade ultimaCidade() {
        return cidades.last();
    }

    public int quantidadeCidades() {
        return cidades.size();
    }

    public boolean estadoVazio() {
        return cidades.isEmpty();
    }
}



