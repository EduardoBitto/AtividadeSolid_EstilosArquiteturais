// 1. Classe principal (Superclasse)
abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método que as subclasses podem alterar sem quebra
    public abstract String getDescricao();
}