package atv02_Associacao_LeitorEmprestimoLivro;

import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Leitor leitor;
    private LocalDate dateRetirada;
    private LocalDate dateDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, LocalDate dateRetirada, LocalDate dateDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dateRetirada = dateRetirada;
        this.dateDevolucao = dateDevolucao;

        System.out.println("Empréstimo registrado com sucesso.");
        leitor.confirmarEmprestimo();
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
    public void setDateRetirada(LocalDate dateRetirada) {
        this.dateRetirada = dateRetirada;
    }
    public void setDateDevolucao(LocalDate dateDevolucao) {
        this.dateDevolucao = dateDevolucao;
    }
    public Livro getLivro() {
        return livro;
    }
    public Leitor getLeitor() {
        return leitor;
    }
    public LocalDate getDateRetirada() {
        return dateRetirada;
    }
    public LocalDate getDateDevolucao() {
        return dateDevolucao;
    }
    public void exibirResumo(){
        System.out.println("Dados do leitor:");
        leitor.exibirInformacoes();

        System.out.println("\nDados do livro:");
        livro.exibirInformacoes();

        System.out.println("\nData da retirada:" + dateRetirada);
        System.out.println("Data da devolucao:" + dateDevolucao);
    }
    public boolean estaAtrasado(LocalDate hoje){
        return hoje.isAfter(dateDevolucao);
    }

    public void devolverLivro() {

    }
}

