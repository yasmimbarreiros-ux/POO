package dao;
import model.Sensor;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class SensorDao {
    public void salvar(Sensor sensor) throws Exception {
        String sql = "INSERT INTO sensor (codigo, tipo, localizacao) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, sensor.getCodigo());
            stmt.setString(2, sensor.getTipo());
            stmt.setString(3, sensor.getLocalizacao());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Erro ao salvar sensor: " + e.getMessage());
        }
    }
    public ArrayList<Sensor> consultar() throws Exception {
        ArrayList<Sensor> lista = new ArrayList<>();
        String sql = "SELECT id_sensor, codigo, tipo, localizacao FROM sensor";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Sensor sensor = new Sensor();

                sensor.setId(rs.getInt("id_sensor"));
                sensor.setCodigo(rs.getString("codigo"));
                sensor.setTipo(rs.getString("tipo"));
                sensor.setLocalizacao(rs.getString("localizacao"));

                lista.add(sensor);
            }

        } catch (SQLException e) {
            throw new Exception("Erro ao consultar sensores: " + e.getMessage());
        }

        return lista;
    }
    public boolean existeCodigo(String codigo) throws Exception {

        String sql = "SELECT COUNT(*) FROM sensor WHERE codigo = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao verificar código do sensor: " + e.getMessage());
        }
        return false;
    }
}