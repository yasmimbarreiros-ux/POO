package atv06_EncerrarConexaoBD;
import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.getConnection();
            System.out.println("Conexão aberta!");
            conn.close();
            System.out.println("Conexão encerrada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}