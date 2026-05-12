package atv02_Associacao_LeitorEmprestimoLivro;

public class Leitor {

    private String nome;
    private String matricula;
    private String email;
    private String telefone;


    public void Leitor(String nome, String matricula, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;

    }
    public void setNome(String Nome) {
        this.nome = Nome;
    }
    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Email: "+ email);
        System.out.println("Telefone: "+ telefone);
    }
    public void confirmarEmprestimo(){
        System.out.println("Empréstimo confirmado para o leitor" + getNome());
    }




}
