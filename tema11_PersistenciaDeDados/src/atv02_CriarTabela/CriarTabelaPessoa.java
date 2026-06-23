package atv02_CriarTabela;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {
    public static void criarTabela() {
        try (
                Connection conn = AbrirConexaoComBD.getConnection();
                Statement sentenca = conn.createStatement()
        ) {

            sentenca.execute(
                    "CREATE TABLE pessoa ("
                            + "id DECIMAL(10,0) PRIMARY KEY, "
                            + "nome VARCHAR(50), "
                            + "endereco VARCHAR(100)"
                            + ")"
            );
            System.out.println("Tabela pessoa criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela.");
            e.printStackTrace();
        }
    }
}