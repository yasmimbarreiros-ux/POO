package Atv05_Pagamento_PagamentoCartao_PagamentoPix;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoCartao(125.00);
        Pagamento pagamento2 = new PagamentoPix(80.00);

        pagamento1.processarPagamento();
        pagamento2.processarPagamento();




    }
}
