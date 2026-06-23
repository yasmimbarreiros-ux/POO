package controller;
import dao.PessoaDao;
import model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaController {
    private PessoaDao dao = new PessoaDao();

    public void cadastrarPessoa(String nome){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        dao.inserir(pessoa);
    }
    public Pessoa consultarPessoa(String nome){
        return dao.buscarPorNome(nome);
    }
    public void atualizarPessoa(int id, String nome) throws SQLException {
        Pessoa pessoa = new Pessoa(id, nome);
        dao.atualizar(pessoa);
    }
    public void excluirPessoa(int id) throws SQLException {
        dao.excluir(id);
    }
}
