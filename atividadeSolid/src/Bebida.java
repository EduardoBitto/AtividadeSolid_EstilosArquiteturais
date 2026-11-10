class Bebida extends Produto {
    private int ml;

    public Bebida(String nome, double preco, int ml) {
        super(nome, preco);
        this.ml = ml;
    }

    @Override
    public String getDescricao() {
        return getNome() + " " + ml + "ml";
    }
}