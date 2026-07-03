package dao;

import model.Medicao;
import model.Sensor;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class MedicaoDao {
    public void salvar(Medicao medicao) throws Exception {

        String sql = "INSERT INTO medicao (valor, unidade, data_hora, id_sensor) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, medicao.getValor());
            stmt.setString(2, medicao.getUnidade());
            stmt.setString(3, medicao.getDataHora());
            stmt.setInt(4, medicao.getSensor().getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Erro ao salvar medição: " + e.getMessage());
        }
    }
    public ArrayList<Medicao> consultar() throws Exception {

        ArrayList<Medicao> lista = new ArrayList<>();
        String sql = """
                SELECT 
                    m.id_medicao,
                    m.valor,
                    m.unidade,
                    m.data_hora,
                    s.id_sensor,
                    s.codigo,
                    s.tipo,
                    s.localizacao
                FROM medicao m
                INNER JOIN sensor s ON m.id_sensor = s.id_sensor
                """;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

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
        } catch (SQLException e) {
            throw new Exception("Erro ao consultar medições: " + e.getMessage());
        }
        return lista;
    }
}