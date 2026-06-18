package atv04_InterfaceGrafica;
import javax.swing.*;
import java.awt.*;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        super("BorderLayout");

        this.setLayout(new BorderLayout());

        JButton norte = new JButton("Button");
        JButton sul = new JButton("Button");
        JButton leste = new JButton("Button");
        JButton centro = new JButton("Button");

        this.setSize(400,300);
        this.setVisible(true);


    }

}
