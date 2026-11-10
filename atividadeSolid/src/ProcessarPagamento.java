class ProcessarPagamento {
    public void pagar(Pedido pedido, MetodoPagamento formaPagamento) {
        formaPagamento.processarPagamento(pedido.calcularTotal());
    }
}
