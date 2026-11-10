class GerenciamentoNotificacoes {
    private INotificacao servicoNotificacao;

    public GerenciamentoNotificacoes(INotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void alertar(Pedido pedido) {
        // Alerta Independente da forma escolhida
        this.servicoNotificacao.enviarNotificacao(pedido);
    }
}