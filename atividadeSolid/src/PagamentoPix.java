class PagamentoPix implements MetodoPagamento {
    @Override
    public void processarPagamento(double valorTotal) {
        System.out.printf("[Pagamento] Processando R$ %.2f via PIX. Aguardando confirmação.\n", valorTotal);
    }
}