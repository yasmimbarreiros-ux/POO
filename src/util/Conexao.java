package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static final String URL = "jdbc:mysql://localhost3066/equipamento";
    public static final String USER = "root";
    public static final String SENHA = "Admin";

    public static Connection getConnection ()throws SQLException{
        return DriverManager.getConnection(URL,USER,SENHA);
    }

}

