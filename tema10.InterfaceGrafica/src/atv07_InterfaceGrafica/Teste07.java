package atv07_InterfaceGrafica;
import javax.swing.*;
import java.awt.*;

public class Teste07 extends JFrame {
    private final JLabel lblNome = new JLabel("");
    private final Icon icone = new ImageIcon("./src/Imagens/images.jpeg");



 public Teste07(){
     super("Exemplo com tooltip");
     setSize(600,400);



     setVisible(true);

     Container c = getContentPane();


 }



}
