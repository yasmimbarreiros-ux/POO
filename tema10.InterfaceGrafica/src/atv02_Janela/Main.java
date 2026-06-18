package atv02_Janela;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JanelaEvento janelaEvento = new JanelaEvento();
        janelaEvento.addWindowListener(new WindowAdapter() {
           @Override
            public void windowClosing(WindowEvent e) {
               super.windowClosing(e);
               System.exit(0);
            }
        });
    }
}
