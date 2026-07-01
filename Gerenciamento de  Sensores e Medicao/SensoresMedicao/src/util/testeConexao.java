package util;
import util.Conexao;
import java.sql.Connection;
public class testeConexao {
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.getConnection();
            System.out.println("Conectou com sucesso!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Erro na conexão:");
            e.printStackTrace();
        }
    }
}