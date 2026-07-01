package dao;

import model.Sensor;
import util.Conexao;

import java.sql.*;

public class SensorDao {
    public void cadastrarSensor(Sensor s){
        String sql = "INSERT INTO Sensor (int id, int codigo, String tipo, String localizacao) VALUES (?, ?, ?, ?)";
        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement smt = conn.prepareStatement(sql);

        ){
            smt.setInt(1, getClass().getModifiers());
            smt.setString(2, s.getTipo());
            smt.setString(3, s.getLocalizacao());
            smt.setInt(4, getClass().getModifiers());


        }catch (SQLException e){
            System.out.println("erro ao cadastrar sensor" + e.getMessage());
        }
    }
    public void buscarSensor(int id){
        String sql = "SELECT * FROM Sensor WHERE id = ?";

        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement smt = conn.prepareStatement(sql);

        ){
            smt.setInt(2, id);
            ResultSet rs = smt.executeQuery();
            rs.next();



        }catch (SQLException e){
            System.out.println("erro ao buscar sensor" + e.getMessage());
        }
    }


}



