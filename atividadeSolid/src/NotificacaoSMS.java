class NotificacaoSMS implements INotificacao {
    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println("[SMS] Olá, " + pedido.getCliente() + "! Seu pedido está sendo preparado.");
    }
}