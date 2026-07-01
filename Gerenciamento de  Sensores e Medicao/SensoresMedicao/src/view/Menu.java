package view;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    private JButton btnTelaSensor;
    private JButton btnTelaMedicao;

    public Menu() {

        setTitle("Sistema de Gerenciamento de Sensores");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Menu Principal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(2, 1, 10, 10));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));

        btnTelaSensor = new JButton("Tela Sensor");
        btnTelaMedicao = new JButton("Tela Medição");

        painelBotoes.add(btnTelaSensor);
        painelBotoes.add(btnTelaMedicao);

        add(painelBotoes, BorderLayout.CENTER);

        btnTelaSensor.addActionListener(e -> {
            TelaSensor telaSensor = new TelaSensor();
            telaSensor.setVisible(true);
        });

        btnTelaMedicao.addActionListener(e -> {
            TelaMedicao telaMedicao = new TelaMedicao();
            telaMedicao.setVisible(true);
        });
    }
}