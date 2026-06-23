package atv02_NotificacaoEmailSMS;

public class Main {
    public static void main(String[] args) {

        Notificacao n1 = new Email();
        Notificacao n2 = new SMS();

        n1.enviarMensagem();
        n2.enviarMensagem();



    }
}
