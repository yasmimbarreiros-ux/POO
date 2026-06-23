package atv08_Eventos;
import javax.swing.*;
import java.awt.*;

public class JanelaBotao extends JFrame {
    private JButton botao1;

    public JanelaBotao() {
        super("Exemplo de Evento");

        setLayout(new FlowLayout());
        botao1 = new JButton("Clique aqui");
        // Criando o listener (gestor)
        GestorBotoes gestorBotoes = new GestorBotoes();
        // Registrando o listener no botão
        botao1.addActionListener(gestorBotoes);

        add(botao1);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}