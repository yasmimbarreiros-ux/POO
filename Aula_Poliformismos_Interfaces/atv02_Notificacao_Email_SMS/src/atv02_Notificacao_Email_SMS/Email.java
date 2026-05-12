package atv02_Notificacao_Email_SMS;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por Email.");

    }

}
