package atv07_Rotulos;

import javax.swing.*;
import java.awt.*;

public class Teste07 extends JFrame {

    private final JLabel label;

    // A imagem está no mesmo pacote de Teste07
    private final Icon icone =
            new ImageIcon(Teste07.class.getResource("rhaenyra.jpg"));

    public Teste07() {

        super("Testando JLabel");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel();

        label.setText("Rainha legítima dos 7 reinos");
        label.setIcon(icone);

        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);

        label.setToolTipText("Essa é a verdaeira e única Rainha");

        container.add(label);

        setSize(500, 300);
        setVisible(true);
    }
}