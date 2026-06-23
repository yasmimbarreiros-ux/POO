package atv10_ControleDeCidades;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {
    private String nome;
    public Cidade(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cidade: " + nome;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Cidade cidade = (Cidade) obj;
        return Objects.equals(nome, cidade.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
    @Override
    public int compareTo(Cidade cidade) {
        return this.nome.compareTo(cidade.getNome());
    }

}
