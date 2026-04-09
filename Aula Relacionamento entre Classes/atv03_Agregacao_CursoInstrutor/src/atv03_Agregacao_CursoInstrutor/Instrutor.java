package atv03_Agregacao_CursoInstrutor;

public class Instrutor {

    private String nome;
    private String formacao;
    private String email;
    private int experienciaAnos;

    public Instrutor(){
    }

    public Instrutor(String nome, String formacao, String email, int experienciaAnos) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experienciaAnos = experienciaAnos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setExperienciaAnos(int experienciaAnos) {
        this.experienciaAnos = experienciaAnos;
    }
    public String getNome() {
        return nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public String getEmail() {
        return email;
    }
    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public void exibirInstrutor(){
        System.out.println("Instrutor" + nome);
        System.out.println("Formacao: " + formacao);
        System.out.println("Email: " + email);
        System.out.println("Experiencia (anos): " + experienciaAnos);
    }
    public void aplicarAvaliacao(String cursoNome){
        System.out.println(nome + "aplicou uma avaliação no curso:" + cursoNome);
    }
    public void responderDuvidas(String duvida){
        System.out.println(nome + "respondeu a dúvida:" + duvida);
    }
    public void criarMaterialDeApoio(String titulo){
        System.out.println(nome + "criou o material de apoio:" + titulo);
    }
    public void agendarLive(String dataHora){
        System.out.println("Live agendada por" + nome + "para:" + dataHora);
    }



}
