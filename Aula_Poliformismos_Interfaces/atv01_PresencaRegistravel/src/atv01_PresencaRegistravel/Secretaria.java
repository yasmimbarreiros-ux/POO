package atv01_PresencaRegistravel;

class Secretaria extends Funcionario implements PresencaRegistravel {

    private String turno;

    public Secretaria(String nome, String turno) {
        super(nome);
        this.turno = turno;
    }

    public void organizarDocumentos() {
        System.out.println(nome + " está organizando documentos no turno " + turno);
    }

    public void registrarPresenca() {
        System.out.println(" Presença registrada para a secretaria " + nome);
    }

    @Override
    public void exibirdados() {
        super.exibirDados();
    }
}