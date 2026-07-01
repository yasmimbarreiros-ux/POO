package dao;

import model.Medicao;
import model.Sensor;
import util.Conexao;

import java.sql.*;

public class MedicaoDao {
    public void cadastrarMedicao(Medicao m){
        String sql = "INSERT INTO Sensor (int id, int valor, int unidade, String dataHora) VALUES (?, ?, ?, ?)";
        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement smt = conn.prepareStatement(sql);

        ){
            smt.setInt(1, m.getId());
            smt.setInt(2,m.getValor());
            smt.setInt(3,m.getUnidade());
            smt.setString(4,m.getDataHora());

        }catch (SQLException e){
            System.out.println("erro ao cadastrar medicicao" + e.getMessage());
        }
    }
    public static void buscarMedicao(int id){
        String sql = "SELECT * FROM Sensor WHERE id = ?";

        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement smt = conn.prepareStatement(sql);

        ){
            smt.setInt(1, id);
            ResultSet rs = smt.executeQuery();
            rs.next();



        }catch (SQLException e){
            System.out.println("erro ao buscar Medicao" + e.getMessage());
        }
    }
}


