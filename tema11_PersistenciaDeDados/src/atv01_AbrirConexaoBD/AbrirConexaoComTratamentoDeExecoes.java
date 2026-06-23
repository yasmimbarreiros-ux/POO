package atv01_AbrirConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AbrirConexaoComTratamentoDeExecoes {

    private static final String URL =
            "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso! Com Excecao Tratada");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
        }
        return conn;
    }
}

