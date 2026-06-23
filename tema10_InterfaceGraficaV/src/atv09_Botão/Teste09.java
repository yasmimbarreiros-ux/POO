package atv09_Botão;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste09 extends JFrame {

    private JButton botao1, botao2;
    private Icon borbo2 = new ImageIcon(Teste09.class.getResource("image.jpg"));
    private String strIcone = "botão associado a uma imagem";
    private String strFinalizar = "Finalizar";

    // Configura a GUI
    public Teste09() {

        super("Testando Botões");

        // Cria o container e define o layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // Cria os botões

        botao1 = new JButton("Botão Java", borbo2);
        botao1.setToolTipText("Pressione o botão");
        botao1.setActionCommand(strIcone);
        container.add(botao1);

        botao2 = new JButton(strFinalizar);
        botao2.setToolTipText("Finaliza o programa");
        container.add(botao2);

        // Cria o objeto gestorBotoes
        GerenciadorBotoes gestorBotoes = new GerenciadorBotoes();

        // Registra os listeners
        botao1.addActionListener(gestorBotoes);
        botao2.addActionListener(gestorBotoes);

        setSize(545, 280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 🔹 Classe interna para tratamento de eventos
    private class GerenciadorBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            // Testa se o botão com imagem foi pressionado
            if (event.getActionCommand().equalsIgnoreCase(strIcone)) {

                JOptionPane.showMessageDialog(null,
                        "Você pressionou: " + event.getActionCommand());
            }

            // Testa se o botão "Finalizar" foi pressionado
            else if (event.getActionCommand().equalsIgnoreCase(strFinalizar)) {

                System.exit(0);
            }
        }
    }

    // Metodo principal
    public static void main(String[] args) {

        Teste09 application = new Teste09();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

