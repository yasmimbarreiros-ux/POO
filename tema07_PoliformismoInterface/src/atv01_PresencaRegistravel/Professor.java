package atv01_PresencaRegistravel;

class Professor extends Funcionario implements PresencaRegistravel {

    private String disciplina;
    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;


    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void lecionar(){
        System.out.println(nome + " está lecionando a disciplina " + disciplina);

    }
    public void registrarPresenca(){
        System.out.println(" Presença registrada para o professor " + getNome());
    }

    @Override
    public void exibirdados() {

    }
}
