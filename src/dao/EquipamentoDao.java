package dao;

import model.Equipamento;
import util.Conexao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class EquipamentoDao {
    public void cadastrarEquipamento(Equipamento equipamento) {
        String sql = "INSERT INTO equipamentos (nome, descricao, valor, patrimonio, fabricante, quantidade" +
                ") VALUES (?, ?, ?)";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ) {

            statement.setInt(1, equipamento.getIdEquipamento());
            statement.setString(2, equipamento.getPatrimonio());
            statement.setString(3, equipamento.getDescricao());
            statement.setString(4, equipamento.getFabricante());
            statement.setInt(5, equipamento.getQuantidade());


        } catch (SQLException e) {
            System.out.println("Erro ao cadastrarEquipamento: " + e.getMessage());

        }

        }
    public void ExcluirEquipamento(Equipamento equipamento) {
        String sql = "DELETE FROM equipamentos  WHERE equipamento_id = ?";
        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);

                ){

            statement.setInt(1,equipamento.getIdEquipamento());
            statement.setString(2, equipamento.getPatrimonio());
            statement.setString(3, equipamento.getDescricao());
            statement.setString(4, equipamento.getFabricante());
            statement.setInt(5, equipamento.getQuantidade());

        } catch (SQLException e) {
            System.out.println("Erro ao deletarEquipamento: " + e.getMessage());
        }
    }
}

