package dao;

import model.Sensor;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SensorDao {

    public void cadastrar(Sensor sensor) {

        String sql = "INSERT INTO sensor (codigo, tipo, localizacao) VALUES (?, ?, ?)";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, sensor.getCodigo());
            stmt.setString(2, sensor.getTipo());
            stmt.setString(3, sensor.getLocalizacao());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Sensor cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar sensor: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar sensor: " + e.getMessage());
        }
    }

    public ArrayList<Sensor> listar() {

        ArrayList<Sensor> lista = new ArrayList<>();

        String sql = "SELECT * FROM sensor";

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

                lista.add(sensor);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao listar sensores: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao listar sensores: " + e.getMessage());
        }

        return lista;
    }

    public Sensor buscarPorId(int id) {

        Sensor sensor = null;

        String sql = "SELECT * FROM sensor WHERE id_sensor = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                sensor = new Sensor();

                sensor.setId(rs.getInt("id_sensor"));
                sensor.setCodigo(rs.getString("codigo"));
                sensor.setTipo(rs.getString("tipo"));
                sensor.setLocalizacao(rs.getString("localizacao"));
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao buscar sensor: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar sensor: " + e.getMessage());
        }

        return sensor;
    }

    public void atualizar(Sensor sensor) {

        String sql = "UPDATE sensor SET codigo = ?, tipo = ?, localizacao = ? WHERE id_sensor = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, sensor.getCodigo());
            stmt.setString(2, sensor.getTipo());
            stmt.setString(3, sensor.getLocalizacao());
            stmt.setInt(4, sensor.getId());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Sensor atualizado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar sensor: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar sensor: " + e.getMessage());
        }
    }

    public void excluir(int id) {

        String sql = "DELETE FROM sensor WHERE id_sensor = ?";

        try {
            Connection conexao = Conexao.getConnection();

            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

            System.out.println("Sensor excluído com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir sensor: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao excluir sensor: " + e.getMessage());
        }
    }
}
