package atv04_BorderLayout;
import javax.swing.*;
import java.awt.*;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        super("Exemplo BorderLayout");

        this.setLayout(new BorderLayout());

        JButton norte = new JButton("NORTE");
        JButton sul = new JButton("SOUTH");
        JButton leste = new JButton("EAST");
        JButton oeste= new JButton("WEST");
        JButton centro   = new JButton("CENTER");

        this.add(norte, BorderLayout.NORTH);
        this.add(sul, BorderLayout.SOUTH);
        this.add(leste, BorderLayout.EAST);
        this.add(oeste,BorderLayout.WEST);
        this.add(centro, BorderLayout.CENTER);




        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

}
