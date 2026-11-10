class EntregaMoto implements IGerenciamentoEntrega {
    @Override
    public void despacharEntrega(Pedido pedido) {
        System.out.println("[Logística] O entregador de moto está a caminho para entregar o pedido de " + pedido.getCliente() + ".");
    }
}