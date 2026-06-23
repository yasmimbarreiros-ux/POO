package atv11_JTextField_JPasswordField;

// Exemplo de JTextField

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class teste11 extends JFrame {

    private JTextField campoTexto1, campoTexto2, campoTexto3;
    private JPasswordField campoSenha;


    public teste11() {

        super("Testando JTextField e JPasswordField");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());


        campoTexto1 = new JTextField(10);
        container.add(campoTexto1);


        campoTexto2 = new JTextField("Digite seu texto aqui:");
        container.add(campoTexto2);


        campoTexto3 = new JTextField("Campo de texto não editável", 20);
        campoTexto3.setEditable(false);
        container.add(campoTexto3);


        campoSenha = new JPasswordField("Texto oculto");
        container.add(campoSenha);

        GerenciadorTextField gerenteTexto = new GerenciadorTextField();

        campoTexto1.addActionListener(gerenteTexto);
        campoTexto2.addActionListener(gerenteTexto);
        campoTexto3.addActionListener(gerenteTexto);
        campoSenha.addActionListener(gerenteTexto);

        setSize(360, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        teste11 programaTexto = new teste11();
        programaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private class GerenciadorTextField implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            String texto = "";


            if (evento.getSource() == campoTexto1) {
                texto = "campoTexto1: " + evento.getActionCommand();
            }


            else if (evento.getSource() == campoTexto2) {
                texto = "campoTexto2: " + evento.getActionCommand();
            }

            else if (evento.getSource() == campoTexto3) {
                texto = "campoTexto3: " + evento.getActionCommand();
            }


            else if (evento.getSource() == campoSenha) {

                JPasswordField senha =
                        (JPasswordField) evento.getSource();

                texto = "campoSenha: "
                        + new String(senha.getPassword());
            }

            JOptionPane.showMessageDialog(null, texto);
        }
    }
}