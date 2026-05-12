package atv02_Notificacao_Email_SMS;

public class SMS implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por SMS.");
    }
}
