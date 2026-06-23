package atv04_ConsultarTabela;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarTabelaPessoa {
    public static void consultarTabela() {
        try (
                Connection conn = Conexao.getConnection();
                Statement sentenca = conn.createStatement()
        ) {
            ResultSet resultado = sentenca.executeQuery("SELECT * FROM pessoa");
            System.out.println("\nDADOS DA TABELA PESSOA\n");
            while (resultado.next()) {
                System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Endereço: " + resultado.getString("endereco"));
                System.out.println("---------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar dados.");
            e.printStackTrace();
        }
    }
}