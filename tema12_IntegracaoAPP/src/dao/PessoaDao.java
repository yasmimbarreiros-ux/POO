package dao;

import model.Pessoa;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome) VALUES (?)";
        try (
                Connection connection = Conexao.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {

            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
        }
    }

    public Pessoa buscarPorNome(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";

        try (
                Connection connection = Conexao.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                return pessoa;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }

        return null;
    }

    public void atualizar(Pessoa pessoa) throws SQLException {

        String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";

        try (
                Connection connection = Conexao.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao atualizar pessoa: " + e.getMessage()
            );
        }
    }

    public void excluir(int id) throws SQLException {

        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (
                Connection connection = Conexao.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao excluir pessoa: " + e.getMessage()
            );
        }
    }
}