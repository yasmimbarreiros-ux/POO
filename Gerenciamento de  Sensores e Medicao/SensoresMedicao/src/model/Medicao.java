package model;

public class Medicao {
    private int id;
    private int valor;
    private int unidade;
    private String dataHora;

    public Medicao() {

    }

    public Medicao(int id, int valor, int unidade, String dataHora) {
        this.id = id;
        this.valor = valor;
        this.unidade  = unidade;
        this.dataHora = dataHora;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
