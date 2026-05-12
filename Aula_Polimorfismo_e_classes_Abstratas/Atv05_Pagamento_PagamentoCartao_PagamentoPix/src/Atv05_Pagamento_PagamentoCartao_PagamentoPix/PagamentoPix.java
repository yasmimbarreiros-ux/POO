package Atv05_Pagamento_PagamentoCartao_PagamentoPix;

class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);

    }
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + valor +  " realizado via Pix");
    }
}
