class PagamentoCartao implements MetodoPagamento {
    @Override
    public void processarPagamento(double valorTotal) {
        System.out.printf("[Pagamento] Processando R$ %.2f via Cartão de Crédito/Débito.\n", valorTotal);
    }
}
