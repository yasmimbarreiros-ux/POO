package model;

public class Sensor {
    private int id;
    private int codigo;
    private String tipo;
    private String localizacao;

    public Sensor() {

    }

    public Sensor(int id, int codigo, String tipo, String localizacao) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.localizacao = localizacao;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}
