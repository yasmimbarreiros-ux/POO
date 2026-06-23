package atv08_Eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class teste08 extends JFrame {
    private JButton botao1;

    public teste08() {
        super("Exemplo de Evento");

        setLayout(new FlowLayout());
        botao1 = new JButton("Clique aqui");
        // Criando o listener (gestor)
        GestorBotoes gestorbotoes = new GestorBotoes();
        // Registrando o listener no botão
        botao1.addActionListener(gestorbotoes);

        add(botao1);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Classe que implementa o listener
    class GestorBotoes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "Botão clicado!");
        }
    }
    public static void main(String[] args) {
        new teste08();
    }
}