public class Main {
    public static void main(String[] args) {
        // Criar o pedido
        Pedido pedidoAtual = new Pedido("Carlos Silva");
        pedidoAtual.adicionarProduto(new Pizza("Pizza Margherita", 45.00, "Grande"));
        pedidoAtual.adicionarProduto(new Hamburguer("X-Salada", 25.00, false));
        pedidoAtual.adicionarProduto(new Bebida("Refrigerante", 12.00, 2000));

        // Apresentar o pedido
        VisualizarPedido visualizador = new VisualizarPedido();
        visualizador.exibirResumo(pedidoAtual);

        // Processar o pagamento
        ProcessarPagamento caixa = new ProcessarPagamento();
        MetodoPagamento pagamentoEscolhido = new PagamentoPix();
        caixa.pagar(pedidoAtual, pagamentoEscolhido);

        // Salvar o pedido
        IGerenciamentoPedido repositorio = new SalvarPedido();
        repositorio.salvar(pedidoAtual);

        System.out.println("\n--- Enviando Notificações (DIP) ---");

        // Escolhendo forma de notificar
        GerenciamentoNotificacoes alertaWhatsApp = new GerenciamentoNotificacoes(new NotificacaoWhatsapp());
        alertaWhatsApp.alertar(pedidoAtual);

        GerenciamentoNotificacoes alertaEmail = new GerenciamentoNotificacoes(new NotificacaoEmail());
        alertaEmail.alertar(pedidoAtual);

        // Logística da entrega e relatório financeiro
        IGerenciamentoEntrega logistica = new EntregaMoto();
        logistica.despacharEntrega(pedidoAtual);

        IRelatorio financeiro = new RelatorioFinanceiro();
        financeiro.gerarRelatorio(pedidoAtual);
    }
}