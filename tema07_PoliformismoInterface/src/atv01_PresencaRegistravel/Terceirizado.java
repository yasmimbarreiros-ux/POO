package atv01_PresencaRegistravel;

class Terceirizado implements PresencaRegistravel {
    private String nome;

    public Terceirizado(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void executarServico() {
        System.out.println(nome + " está executando serviços terceirizados.");
    }

    public void registrarPresenca() {
        System.out.println("Presença registrada para o terceirizado " + nome);
    }
}
