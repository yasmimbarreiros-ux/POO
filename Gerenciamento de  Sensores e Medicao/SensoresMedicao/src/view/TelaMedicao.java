package view;

import controller.MedicaoController;
import controller.SensorController;
import model.Medicao;
import model.Sensor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TelaMedicao extends JFrame {

    private JTextField txtId;
    private JTextField txtValor;
    private JTextField txtUnidade;
    private JTextField txtDataHora;

    private JComboBox<Sensor> comboSensor;

    private JButton btnSalvar;
    private JButton btnConsultar;

    private JTable tabela;
    private DefaultTableModel modeloTabela;

    private MedicaoController medicaoController = new MedicaoController();
    private SensorController sensorController = new SensorController();

    public TelaMedicao() {

        setTitle("Gerenciamento de Medições");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Cadastro de Medição", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo, BorderLayout.NORTH);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel painelCampos = new JPanel(new GridLayout(5, 2, 10, 10));

        JLabel lblId = new JLabel("ID:");
        JLabel lblValor = new JLabel("Valor:");
        JLabel lblUnidade = new JLabel("Unidade:");
        JLabel lblDataHora = new JLabel("Data/Hora:");
        JLabel lblSensor = new JLabel("Sensor:");

        txtId = new JTextField();
        txtValor = new JTextField();
        txtUnidade = new JTextField();
        txtDataHora = new JTextField();

        txtId.setEditable(false);

        comboSensor = new JComboBox<>();

        painelCampos.add(lblId);
        painelCampos.add(txtId);

        painelCampos.add(lblValor);
        painelCampos.add(txtValor);

        painelCampos.add(lblUnidade);
        painelCampos.add(txtUnidade);

        painelCampos.add(lblDataHora);
        painelCampos.add(txtDataHora);

        painelCampos.add(lblSensor);
        painelCampos.add(comboSensor);

        painelPrincipal.add(painelCampos, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnSalvar = new JButton("Salvar");
        btnConsultar = new JButton("Consultar");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnConsultar);

        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);

        modeloTabela = new DefaultTableModel();

        modeloTabela.addColumn("ID");
        modeloTabela.addColumn("Valor");
        modeloTabela.addColumn("Unidade");
        modeloTabela.addColumn("Data/Hora");
        modeloTabela.addColumn("Sensor");

        tabela = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setPreferredSize(new Dimension(850, 300));

        painelPrincipal.add(scrollPane, BorderLayout.SOUTH);

        add(painelPrincipal, BorderLayout.CENTER);

        btnSalvar.addActionListener(e -> salvarMedicao());

        btnConsultar.addActionListener(e -> listarMedicoes());

        carregarSensores();
    }

    private void carregarSensores() {

        comboSensor.removeAllItems();

        ArrayList<Sensor> sensores = sensorController.listarSensores();

        for (Sensor sensor : sensores) {
            comboSensor.addItem(sensor);
        }
    }

    private void salvarMedicao() {

        if (txtValor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Valor é obrigatório.");
            return;
        }

        if (txtUnidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Unidade é obrigatório.");
            return;
        }

        if (txtDataHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Data/Hora é obrigatório.");
            return;
        }

        if (comboSensor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Cadastre um sensor antes de salvar a medição.");
            return;
        }

        try {
            double valor = Double.parseDouble(txtValor.getText().replace(",", "."));

            Sensor sensorSelecionado = (Sensor) comboSensor.getSelectedItem();

            Medicao medicao = new Medicao();

            medicao.setValor(valor);
            medicao.setUnidade(txtUnidade.getText());
            medicao.setDataHora(txtDataHora.getText());
            medicao.setSensor(sensorSelecionado);

            medicaoController.cadastrarMedicao(medicao);

            JOptionPane.showMessageDialog(this, "Medição cadastrada com sucesso!");

            limparCampos();
            listarMedicoes();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor numérico válido.");
        }
    }

    private void listarMedicoes() {

        modeloTabela.setRowCount(0);

        ArrayList<Medicao> lista = medicaoController.listarMedicoes();

        for (Medicao medicao : lista) {

            String sensor = "";

            if (medicao.getSensor() != null) {
                sensor = medicao.getSensor().getCodigo();
            }

            modeloTabela.addRow(new Object[]{
                    medicao.getId(),
                    medicao.getValor(),
                    medicao.getUnidade(),
                    medicao.getDataHora(),
                    sensor
            });
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtValor.setText("");
        txtUnidade.setText("");
        txtDataHora.setText("");

        if (comboSensor.getItemCount() > 0) {
            comboSensor.setSelectedIndex(0);
        }
    }
}