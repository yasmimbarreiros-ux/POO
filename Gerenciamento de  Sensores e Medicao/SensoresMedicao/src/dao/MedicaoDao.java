package dao;

import model.Medicao;
import model.Sensor;
import util.Conexao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicaoDao {

    public void cadastrar(Medicao medicao) {

        String sql = "INSERT INTO medicao (valor, unidade, data_hora, id_sensor) VALUES (?, ?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setDouble(1, medicao.getValor());
            stmt.setString(2, medicao.getUnidade());
            stmt.setString(3, medicao.getDataHora());
            stmt.setInt(4, medicao.getSensor().getId());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Medição cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar medição: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar medição: " + e.getMessage());
        }
    }

    public ArrayList<Medicao> listar() {

        ArrayList<Medicao> lista = new ArrayList<>();

        String sql = "SELECT " +
                "m.id_medicao, " +
                "m.valor, " +
                "m.unidade, " +
                "m.data_hora, " +
                "s.id_sensor, " +
                "s.codigo, " +
                "s.tipo, " +
                "s.localizacao " +
                "FROM medicao m " +
                "INNER JOIN sensor s ON m.id_sensor = s.id_sensor " +
                "ORDER BY m.id_medicao";

        try {
            Connection conexao = Conexao.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Sensor sensor = new Sensor();
                sensor.setId(rs.getInt("id_sensor"));
                sensor.setCodigo(rs.getString("codigo"));
                sensor.setTipo(rs.getString("tipo"));
                sensor.setLocalizacao(rs.getString("localizacao"));

                Medicao medicao = new Medicao();
                medicao.setId(rs.getInt("id_medicao"));
                medicao.setValor(rs.getDouble("valor"));
                medicao.setUnidade(rs.getString("unidade"));
                medicao.setDataHora(rs.getString("data_hora"));
                medicao.setSensor(sensor);

                lista.add(medicao);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao listar medições: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao listar medições: " + e.getMessage());
        }

        return lista;
    }

    public void atualizar(Medicao medicao) {

        String sql = "UPDATE medicao SET valor = ?, unidade = ?, data_hora = ?, id_sensor = ? WHERE id_medicao = ?";

        try {
            Connection conexao = Conexao.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setDouble(1, medicao.getValor());
            stmt.setString(2, medicao.getUnidade());
            stmt.setString(3, medicao.getDataHora());
            stmt.setInt(4, medicao.getSensor().getId());
            stmt.setInt(5, medicao.getId());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Medição atualizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar medição: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar medição: " + e.getMessage());
        }
    }

    public void excluir(int id) {

        String sql = "DELETE FROM medicao WHERE id_medicao = ?";

        try {
            Connection conexao = Conexao.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Medição excluída com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir medição: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao excluir medição: " + e.getMessage());
        }
    }
}