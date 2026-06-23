package atv02_NotificacaoEmailSMS;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por Email.");

    }

}
