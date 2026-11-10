class PagamentoDinheiro implements MetodoPagamento {
    @Override
    public void processarPagamento(double valorTotal) {
        System.out.printf("[Pagamento] Pagamento de R$ %.2f em Dinheiro. Separando troco.\n", valorTotal);
    }
}