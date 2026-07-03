package model;

public class Medicao {
    private int id;
    private double valor;
    private String unidade;
    private String dataHora;
    private Sensor sensor;

    public Medicao() {
    }

    public Medicao(int id, int valor, String unidade, String dataHora) {
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
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    public void setUnidade(int unidade) {
        this.unidade = Integer.toString(unidade);
    }
}
