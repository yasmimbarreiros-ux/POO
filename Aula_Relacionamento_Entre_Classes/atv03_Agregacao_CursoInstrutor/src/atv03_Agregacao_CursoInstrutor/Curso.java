package atv03_Agregacao_CursoInstrutor;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private Instrutor instrutor1;
    private Instrutor instrutor2;

    public Curso(){
        this.instrutor1 = null;
        this.instrutor2 = null;
    }
    public Curso(String nome, int cargaHoraria, String nivel, String descricao){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutor1 = null;
        this.instrutor2 = null;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setInstrutor1(Instrutor instrutor1) {
        this.instrutor1 = instrutor1;
    }

    public void setInstrutor2(Instrutor instrutor2) {
        this.instrutor2 = instrutor2;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public Instrutor getInstrutor1() {
        return instrutor1;
    }

    public Instrutor getInstrutor2() {
        return instrutor2;
    }


    public void associarInstrutor(Instrutor instrutor){
        if(instrutor1 == null){
            instrutor1 = instrutor;
        } else if (instrutor2 == null) {
            instrutor2 = instrutor;
        } else {
            System.out.println("Não é possível adicionar mais um instrutores a este curso");
        }
    }

    public void exibirCurso(){
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores associados:");

        if(instrutor1 != null){
            instrutor1.exibirInstrutor();
        }
        if(instrutor2 != null){
            instrutor2.exibirInstrutor();
        }
        if(instrutor1 == null && instrutor2 == null){
            System.out.println("Nenhum instrutor associado");
        }
    }
}