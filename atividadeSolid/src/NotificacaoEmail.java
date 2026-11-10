class NotificacaoEmail implements INotificacao {
    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println("[Email] Enviando recibo para o e-mail de " + pedido.getCliente() + ".");
    }
}