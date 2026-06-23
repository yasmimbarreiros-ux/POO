package atv02_JanelaComEvento;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JanelaEvento janela = new JanelaEvento();

        janela.addWindowListener(
                new WindowAdapter() {
                  public void windowClosing(WindowEvent e) {
                     System.exit(0);
            }
        });
    }





}

