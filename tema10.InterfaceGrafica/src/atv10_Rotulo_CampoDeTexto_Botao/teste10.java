package atv10_Rotulo_CampoDeTexto_Botao;

import javax.swing.*;

public class teste10 extends JFrame {

    private JLabel labelCodigo;
    private JLabel labelNome;
    private JLabel labelEmail;

    private JTextField textFieldCodigo;
    private JTextField textFieldNome;
    private JTextField textFieldEmail;

    private JButton buttonCadastrar;

    public teste10(){
        initComponemts();
    }
    private void initComponemts(){
        labelCodigo = new JLabel();
        labelNome = new JLabel();
        labelEmail = new JLabel();

        JTextField fieldCodigo   = new JTextField();
        JTextField fieldNome = new JTextField();
        JTextField fieldEmail = new JTextField();

        buttonCadastrar = new JButton();

        this.setTitle("Cadastrar Cliente");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null); // layout absoluto

        labelCodigo.setText("Código:");
        labelCodigo.setBounds(30, 30, 70, 20);
        this.add(labelCodigo);

        labelNome.setText("Nome:");
        labelNome.setBounds(30, 80, 70, 20);
        this.add(labelNome);

        labelEmail.setText("Email:");
        labelEmail.setBounds(30, 130, 70, 20);
        this.add(labelEmail);


        fieldCodigo.setBounds(90, 30, 50, 20);
        fieldCodigo.setEnabled(false);
        this.add(fieldCodigo);

        fieldNome.setBounds(90, 80, 250, 20);
        this.add(fieldNome);

        fieldEmail.setBounds(90, 130, 250, 20);
        this.add(fieldEmail);


        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setBounds(90, 180, 120, 25);
        this.add(buttonCadastrar);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new teste10();
            }
        });
    }
}





