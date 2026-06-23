package view;

import controller.PessoaController;
import model.Pessoa;
import java.sql.SQLException;

import javax.swing.*;

public class JanelaCadastrarPessoa extends JFrame {

    private PessoaController controller = new PessoaController();

    private JLabel labelNome;
    private JLabel labelId;

    private JTextField txtNome;
    private JTextField txtId;

    private JTextArea txtResultado;

    private JButton btnCadastrar;
    private JButton btnConsultar;
    private JButton btnAtualizar;
    private JButton btnExcluir;

    public JanelaCadastrarPessoa() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoa");

        labelNome = new JLabel("Nome:");
        labelNome.setBounds(30, 40, 50, 25);
        add(labelNome);

        txtNome = new JTextField();
        txtNome.setBounds(90, 40, 180, 25);
        add(txtNome);

        labelId = new JLabel("ID:");
        labelId.setBounds(30, 80, 50, 25);
        add(labelId);

        txtId = new JTextField();
        txtId.setBounds(90, 80, 180, 25);
        add(txtId);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(30, 120, 110, 30);
        add(btnCadastrar);

        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(160, 120, 110, 30);
        add(btnConsultar);

        txtResultado = new JTextArea();
        txtResultado.setBounds(30, 170, 240, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(30, 290, 110, 30);
        add(btnAtualizar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(160, 290, 110, 30);
        add(btnExcluir);

        btnCadastrar.addActionListener(e -> {
            String nome = txtNome.getText();

            controller.cadastrarPessoa(nome);

            JOptionPane.showMessageDialog(this, "Pessoa cadastrada com sucesso!");

            txtNome.setText("");
            txtId.setText("");
        });

        btnConsultar.addActionListener(e -> {
            String nome = txtNome.getText();

            Pessoa pessoa = controller.consultarPessoa(nome);

            if (pessoa != null) {
                txtResultado.setText(
                        "id: " + pessoa.getId()
                                + "\nnome: " + pessoa.getNome()
                );

                txtId.setText(String.valueOf(pessoa.getId()));
                txtNome.setText(pessoa.getNome());

            } else {
                txtResultado.setText("Pessoa não encontrada");
            }
        });
        btnAtualizar.addActionListener(e -> {
            try {
                if (txtId.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Informe o ID!");
                    return;
                }

                int id = Integer.parseInt(txtId.getText());
                String novoNome = txtNome.getText();

                controller.atualizarPessoa(id, novoNome);

                JOptionPane.showMessageDialog(this, "Pessoa atualizada com sucesso!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
            }
        });

        btnExcluir.addActionListener(e -> {
            try {
                if (txtId.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Informe o ID!");
                    return;
                }

                int id = Integer.parseInt(txtId.getText());

                controller.excluirPessoa(id);

                JOptionPane.showMessageDialog(this, "Pessoa excluída com sucesso!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
            }
        });
        setSize(330, 420);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}