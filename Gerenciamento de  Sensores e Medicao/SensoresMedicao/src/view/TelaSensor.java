package view;

import model.Sensor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class TelaSensor extends JFrame {


    private JTextField txtId;
    private JTextField txtCodigo;
    private JTextField txtTipo;
    private JTextField txtLocalizacao;


    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private JLabel lblTotal;

    public TelaSensor() {
        setTitle("Gerenciamento de Sensores");
        setSize(750, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Cadastro de Sensor", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo, BorderLayout.NORTH);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 10, 10));
        painelCampos.setBorder(BorderFactory.createTitledBorder("Dados do sensor"));



        txtId = new JTextField();
        txtCodigo = new JTextField();
        txtTipo = new JTextField();
        txtLocalizacao = new JTextField();

        painelCampos.add(new JLabel("ID:"));
        painelCampos.add(txtId);

        painelCampos.add(new JLabel("Codigo:"));
        painelCampos.add(txtCodigo);

        painelCampos.add(new JLabel("Tipo:"));
        painelCampos.add(txtTipo);

        painelCampos.add(new JLabel("Localizacao:"));
        painelCampos.add(txtLocalizacao);

        JButton btnSalvar = new JButton("Salvar");
        JButton btnConsultar = new JButton("Consultar");



        painelCampos.add(btnSalvar);
        painelCampos.add(btnConsultar);

        String[] colunas = {
                "ID",
                "Codigo",
                "Tipo",
                "Localizacao"
        };

        modeloTabela = new DefaultTableModel(colunas, 0);
        tabela = new JTable(modeloTabela);

        JScrollPane scrollTabela = new JScrollPane(tabela);
        scrollTabela.setBorder(BorderFactory.createTitledBorder("Sensores Cadastrados"));


        painelPrincipal.add(painelCampos, BorderLayout.NORTH);
        painelPrincipal.add(scrollTabela, BorderLayout.CENTER);
        painelPrincipal.add(lblTotal, BorderLayout.SOUTH);

        add(painelPrincipal, BorderLayout.CENTER);


    }
    private void salvarSensor() {
        String id = txtId.getText();
        String codigo = txtCodigo.getText();
        String tipo = txtTipo.getText();
        String localizacao = txtLocalizacao.getText();


        if (id.isEmpty() || codigo.isEmpty() || tipo.isEmpty()
                || localizacao.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        modeloTabela.addRow(new Object[]{
                id,
                codigo,
                tipo,
                localizacao

        });
    }

    private void ConsultarSensor() {
        int linhaSelecionada = tabela.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um sensor na tabela!");
            return;
        }



    }
}