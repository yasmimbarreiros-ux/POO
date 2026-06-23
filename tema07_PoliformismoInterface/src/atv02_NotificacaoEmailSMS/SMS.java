package atv02_NotificacaoEmailSMS;

public class SMS implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por SMS.");
    }
}
