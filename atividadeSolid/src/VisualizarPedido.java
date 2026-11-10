class VisualizarPedido {
    public void exibirResumo(Pedido pedido) {
        System.out.println("\n=== Resumo do Pedido ===");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Itens:");
        // Apresenta itens independente do tipo
        for (Produto produto : pedido.getProdutos()) {
            System.out.printf(" - %s: R$ %.2f\n", produto.getDescricao(), produto.getPreco());
        }
        System.out.printf("Total a pagar: R$ %.2f\n", pedido.calcularTotal());
        System.out.println("========================\n");
    }
}