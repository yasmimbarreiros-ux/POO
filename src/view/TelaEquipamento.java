package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaEquipamento extends JFrame {

    private JTextField txtId;
    private JTextField txtPatrimonio;
    private JTextField txtDescricao;
    private JTextField txtFabricante;
    private JTextField txtQuantidade;

    private JComboBox<String> comboLaboratorio;

    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private JLabel lblTotal;

    public TelaEquipamento() {
        setTitle("Sistema de Laboratórios - Equipamento");
        setSize(750, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Gerenciamento de Equipamentos", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo, BorderLayout.NORTH);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 10, 10));
        painelCampos.setBorder(BorderFactory.createTitledBorder("Dados do Equipamento"));

        txtId = new JTextField();
        txtPatrimonio = new JTextField();
        txtDescricao = new JTextField();
        txtFabricante = new JTextField();
        txtQuantidade = new JTextField();

        comboLaboratorio = new JComboBox<>();
        comboLaboratorio.addItem("Lab. Informática 1 (Bloco A)");
        comboLaboratorio.addItem("Lab. Redes (Bloco B)");
        comboLaboratorio.addItem("Lab. Eletrônica (Bloco C)");

        painelCampos.add(new JLabel("ID:"));
        painelCampos.add(txtId);

        painelCampos.add(new JLabel("Patrimônio:"));
        painelCampos.add(txtPatrimonio);

        painelCampos.add(new JLabel("Descrição:"));
        painelCampos.add(txtDescricao);

        painelCampos.add(new JLabel("Fabricante:"));
        painelCampos.add(txtFabricante);

        painelCampos.add(new JLabel("Quantidade:"));
        painelCampos.add(txtQuantidade);

        painelCampos.add(new JLabel("Laboratório:"));
        painelCampos.add(comboLaboratorio);

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoExcluir = new JButton("Excluir");

        painelCampos.add(botaoSalvar);
        painelCampos.add(botaoExcluir);

        String[] colunas = {
                "ID",
                "Patrimônio",
                "Descrição",
                "Fabricante",
                "Quantidade",
                "Laboratório"
        };

        modeloTabela = new DefaultTableModel(colunas, 0);
        tabela = new JTable(modeloTabela);

        JScrollPane scrollTabela = new JScrollPane(tabela);
        scrollTabela.setBorder(BorderFactory.createTitledBorder("Equipamentos Cadastrados"));

        lblTotal = new JLabel("Total de equipamentos: 0");

        painelPrincipal.add(painelCampos, BorderLayout.NORTH);
        painelPrincipal.add(scrollTabela, BorderLayout.CENTER);
        painelPrincipal.add(lblTotal, BorderLayout.SOUTH);

        add(painelPrincipal, BorderLayout.CENTER);

        botaoSalvar.addActionListener(e -> salvarEquipamento());
        botaoExcluir.addActionListener(e -> excluirEquipamento());
    }

    private void salvarEquipamento() {
        String id = txtId.getText();
        String patrimonio = txtPatrimonio.getText();
        String descricao = txtDescricao.getText();
        String fabricante = txtFabricante.getText();
        String quantidade = txtQuantidade.getText();
        String laboratorio = comboLaboratorio.getSelectedItem().toString();

        if (id.isEmpty() || patrimonio.isEmpty() || descricao.isEmpty()
                || fabricante.isEmpty() || quantidade.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        modeloTabela.addRow(new Object[]{
                id,
                patrimonio,
                descricao,
                fabricante,
                quantidade,
                laboratorio
        });

        atualizarTotal();
        limparCampos();
    }

    private void excluirEquipamento() {
        int linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um equipamento na tabela!");
            return;
        }

        modeloTabela.removeRow(linhaSelecionada);
        atualizarTotal();
    }

    private void atualizarTotal() {
        lblTotal.setText("Total de equipamentos: " + modeloTabela.getRowCount());
    }

    private void limparCampos() {
        txtId.setText("");
        txtPatrimonio.setText("");
        txtDescricao.setText("");
        txtFabricante.setText("");
        txtQuantidade.setText("");
        comboLaboratorio.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new TelaEquipamento().setVisible(true);
    }
}