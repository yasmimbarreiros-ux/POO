package model;

public class Equipamento {

    private int idEquipamento;
    private String patrimonio;
    private String descricao;
    private String fabricante;
    private int    quantidade;


    public void Equipamento(int idEqupamento, String patrimonio, String descricao,String fabricante, int quantidade){
        this.idEquipamento = idEquipamento;
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
    }
    public int getIdEquipamento() {
        return idEquipamento;
    }
    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }
    public String getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
