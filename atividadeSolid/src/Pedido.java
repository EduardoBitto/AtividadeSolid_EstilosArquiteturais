import java.util.ArrayList;
import java.util.List;

class Pedido {
    private String cliente;
    private List<Produto> produtos;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    // Adiciona qualquer produto
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}