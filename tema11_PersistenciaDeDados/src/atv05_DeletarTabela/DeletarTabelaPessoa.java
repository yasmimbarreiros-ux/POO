package atv05_DeletarTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletarTabelaPessoa {
    public static void deletarRegistro() {
        try (
                Connection conn = Conexao.getConnection();
                Statement sentenca = conn.createStatement()
        ) {
            sentenca.executeUpdate("DELETE FROM pessoa " + "WHERE id = 1");
            System.out.println("Registro removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover registro.");
            e.printStackTrace();
        }
    }
}