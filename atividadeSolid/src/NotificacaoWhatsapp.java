class NotificacaoWhatsapp implements INotificacao {
    @Override
    public void enviarNotificacao(Pedido pedido) {
        System.out.println("[WhatsApp] Mensagem para " + pedido.getCliente() + ": Seu pedido saiu para entrega!");
    }
}