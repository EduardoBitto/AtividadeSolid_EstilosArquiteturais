class SalvarPedido implements IGerenciamentoPedido {
    @Override
    public void salvar(Pedido pedido) {
        System.out.println("[Banco de Dados] Pedido do(a) " + pedido.getCliente() + " salvo com sucesso.");
    }
}