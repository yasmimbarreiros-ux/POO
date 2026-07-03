package view;

import controller.SensorController;
import model.Sensor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TelaSensor extends JFrame {

    private JTextField txtId;
    private JTextField txtCodigo;
    private JTextField txtTipo;
    private JTextField txtLocalizacao;

    private JButton btnSalvar;
    private JButton btnConsultar;

    private JTable tabela;
    private DefaultTableModel modeloTabela;

    private SensorController sensorController = new SensorController();

    public TelaSensor() {

        setTitle("Gerenciamento de Sensores");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Cadastro de Sensor", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo, BorderLayout.NORTH);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel lblId = new JLabel("ID:");
        JLabel lblCodigo = new JLabel("Código:");
        JLabel lblTipo = new JLabel("Tipo:");
        JLabel lblLocalizacao = new JLabel("Localização:");

        txtId = new JTextField();
        txtCodigo = new JTextField();
        txtTipo = new JTextField();
        txtLocalizacao = new JTextField();

        txtId.setEditable(false);

        painelCampos.add(lblId);
        painelCampos.add(txtId);

        painelCampos.add(lblCodigo);
        painelCampos.add(txtCodigo);

        painelCampos.add(lblTipo);
        painelCampos.add(txtTipo);

        painelCampos.add(lblLocalizacao);
        painelCampos.add(txtLocalizacao);

        painelPrincipal.add(painelCampos, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnSalvar = new JButton("Salvar");
        btnConsultar = new JButton("Consultar");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnConsultar);

        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);

        modeloTabela = new DefaultTableModel();

        modeloTabela.addColumn("ID");
        modeloTabela.addColumn("Código");
        modeloTabela.addColumn("Tipo");
        modeloTabela.addColumn("Localização");

        tabela = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setPreferredSize(new Dimension(850, 300));

        painelPrincipal.add(scrollPane, BorderLayout.SOUTH);

        add(painelPrincipal, BorderLayout.CENTER);

        btnSalvar.addActionListener(e -> salvarSensor());

        btnConsultar.addActionListener(e -> listarSensores());
    }

    private void salvarSensor() {

        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Código é obrigatório.");
            return;
        }

        if (txtTipo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Tipo é obrigatório.");
            return;
        }

        if (txtLocalizacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Localização é obrigatório.");
            return;
        }

        try {
            Sensor sensor = new Sensor();

            sensor.setCodigo(txtCodigo.getText());
            sensor.setTipo(txtTipo.getText());
            sensor.setLocalizacao(txtLocalizacao.getText());

            sensorController.salvar(sensor);

            JOptionPane.showMessageDialog(this, "Sensor cadastrado com sucesso!");

            limparCampos();
            listarSensores();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    private void listarSensores() {
        try {
            modeloTabela.setRowCount(0);
            ArrayList<Sensor> lista = sensorController.consultar();
            for (Sensor sensor : lista) {
                modeloTabela.addRow(new Object[]{
                        sensor.getId(),
                        sensor.getCodigo(),
                        sensor.getTipo(),
                        sensor.getLocalizacao()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar sensores: " + erro.getMessage());
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtCodigo.setText("");
        txtTipo.setText("");
        txtLocalizacao.setText("");
    }
}