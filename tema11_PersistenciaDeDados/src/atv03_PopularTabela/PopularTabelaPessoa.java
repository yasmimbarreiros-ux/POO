package atv03_PopularTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PopularTabelaPessoa {
    public static void popularTabela() {
        try (
                Connection conn = ConexaoComBD.getConnection();
                Statement sentenca = conn.createStatement()
        ) {
            sentenca.execute("INSERT INTO pessoa VALUES "+"(1, 'André Silva', 'Av. Brasil, 100')");
            sentenca.execute("INSERT INTO pessoa VALUES "+ "(2, 'João Bezerra', 'Av. João Naves, 300')");
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados.");
            e.printStackTrace();
        }
    }
}
