class RelatorioFinanceiro implements IRelatorio {
    @Override
    public void gerarRelatorio(Pedido pedido) {
        System.out.println("[Relatório] Gerando nota fiscal para contabilidade. Valor total: R$ " + pedido.calcularTotal());
    }
}