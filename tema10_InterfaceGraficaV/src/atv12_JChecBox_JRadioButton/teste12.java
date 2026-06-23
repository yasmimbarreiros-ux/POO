package atv12_JChecBox_JRadioButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class teste12 extends JFrame {

    private JCheckBox checkB, checkI;
    private JRadioButton rbotao1, rbotao2, rbotao3;
    private ButtonGroup grupoRadio;
    private JPanel painel1, painel2;

    public teste12() {
        super("Testando CheckBox e RadioButton");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define Container e layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // Define Painéis
        painel1 = new JPanel();
        painel2 = new JPanel();

        // Define CheckBox
        checkB = new JCheckBox("Bold");
        checkI = new JCheckBox("Itálico");
        painel1.add(checkB);
        painel1.add(checkI);
        container.add(painel1);

        // Define RadioButtons
        rbotao1 = new JRadioButton("Plain", true);
        rbotao2 = new JRadioButton("Bold", false);
        rbotao3 = new JRadioButton("Itálico", false);

        painel2.add(rbotao1);
        painel2.add(rbotao2);
        painel2.add(rbotao3);
        container.add(painel2);

        // Define Grupo dos radios
        grupoRadio = new ButtonGroup();
        grupoRadio.add(rbotao1);
        grupoRadio.add(rbotao2);
        grupoRadio.add(rbotao3);

        // Define Listener único (ItemListener)
        Gerenciador gerente = new Gerenciador();
        checkB.addItemListener(gerente);
        checkI.addItemListener(gerente);
        rbotao1.addItemListener(gerente);
        rbotao2.addItemListener(gerente);
        rbotao3.addItemListener(gerente);

        setSize(320, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Classe interna para tratamento de eventos
    private class Gerenciador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {

            Object src = event.getSource();
            boolean selecionado = (event.getStateChange() == ItemEvent.SELECTED);

            //Importante: abre o JOptionPane DEPOIS do Swing repintar o componente
            SwingUtilities.invokeLater(() -> {

                if (src == checkB) {
                    JOptionPane.showMessageDialog(
                            teste12.this,
                            "Checkbox Bold " + (selecionado ? "selecionado" : "desmarcado")
                    );
                } else if (src == checkI) {
                    JOptionPane.showMessageDialog(
                           teste12.this,
                            "Checkbox Itálico " + (selecionado ? "selecionado" : "desmarcado")
                    );
                } else if (src == rbotao1 && selecionado) {
                    JOptionPane.showMessageDialog(
                            teste12.this,
                            "Radio Plain selecionado"
                    );
                } else if (src == rbotao2 && selecionado) {
                    JOptionPane.showMessageDialog(
                            teste12.this,
                            "Radio Bold selecionado"
                    );
                } else if (src == rbotao3 && selecionado) {
                    JOptionPane.showMessageDialog(
                           teste12.this,
                            "Radio Itálico selecionado"
                    );
                }
            });
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(teste12::new);
    }
}
