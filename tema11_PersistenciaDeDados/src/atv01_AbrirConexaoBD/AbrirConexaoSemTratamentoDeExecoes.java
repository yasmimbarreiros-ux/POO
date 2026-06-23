package atv01_AbrirConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrirConexaoSemTratamentoDeExecoes {

    private static final String URL = "jdbc:mysql://localhost:3306/bancoTeste01";
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conexão realizada com sucesso! Sem Excecao Tratada");
        return conn;
    }
}