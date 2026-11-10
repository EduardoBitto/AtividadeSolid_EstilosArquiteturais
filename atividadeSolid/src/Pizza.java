class Pizza extends Produto {
    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return getNome() + " (Tamanho: " + tamanho + ")";
    }
}