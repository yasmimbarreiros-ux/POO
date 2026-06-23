package atv06_SpringLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class ExemploSpringLayout extends JFrame {
    public ExemploSpringLayout() {

        super("Exemplo SpringLayout");

        SpringLayout layout = new SpringLayout();
        Container c = getContentPane();
        c.setLayout(layout);


        JButton botao1 = new JButton("botao1");
        JButton botao2 = new JButton("botao2");

        c.add(botao1);
        c.add(botao2);


        //Restrições Botão 1
        layout.putConstraint(SpringLayout.NORTH,botao1,20,SpringLayout.NORTH,c);
        layout.putConstraint(SpringLayout.WEST, botao1, 30, SpringLayout.WEST, c);

        //Restrições Botão 2
        layout.putConstraint(SpringLayout.NORTH,botao2,20,SpringLayout.SOUTH,botao1);
        layout.putConstraint(SpringLayout.WEST, botao2, 0, SpringLayout.WEST, botao1);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
    public static void main(String[] args) {
        ExemploSpringLayout layout = new ExemploSpringLayout();
    }
}
