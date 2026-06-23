package atv02_AgendaDeContatos;

public class Main {
    public static void main(String[] args) {
        //a agenda
        Agenda agenda = new Agenda();


        //contatos
        Contato c1 = new Contato("Ana");
        Contato c2 = new Contato("Carlos");
        Contato c3 = new Contato("Juliana");


        //adicionando contatos

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);

        agenda.listarContatos();

        agenda.removerContato(c1);

        agenda.listarContatos();

    }
}
