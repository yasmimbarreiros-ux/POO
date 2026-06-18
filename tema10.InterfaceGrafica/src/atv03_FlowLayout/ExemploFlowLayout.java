package atv03_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {

    public ExemploFlowLayout() {
        super("Frame com FlowLayout");
        JButton b1 = new JButton("BOTÃO 1");
        JButton b2 = new JButton("BOTÃO 2");
        JButton b3 = new JButton("BOTÃO 3");

        this.setSize(320,120);
        //serve para obter a área interna da janela
        Container container = this.getContentPane();
        container.add(b1);
        container.add(b2);
        container.add(b3);

        container.setLayout(new FlowLayout(java.awt.FlowLayout.RIGHT));
        this.setVisible(true);




    }




}
