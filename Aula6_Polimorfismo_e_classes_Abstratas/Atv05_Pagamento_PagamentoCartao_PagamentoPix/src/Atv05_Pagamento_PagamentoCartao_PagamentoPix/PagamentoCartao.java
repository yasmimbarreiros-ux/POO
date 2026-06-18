package Atv05_Pagamento_PagamentoCartao_PagamentoPix;

class PagamentoCartao  extends Pagamento{

    public PagamentoCartao(double valor){
        super(valor);
    }
    @Override
    public void processarPagamento(){
        System.out.println("Pagamento de R$ " + valor +  " realizado com cartão");

    }
}
