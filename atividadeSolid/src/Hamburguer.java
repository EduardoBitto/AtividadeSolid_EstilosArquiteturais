class Hamburguer extends Produto {
    private boolean artesanal;

    public Hamburguer(String nome, double preco, boolean artesanal) {
        super(nome, preco);
        this.artesanal = artesanal;
    }

    @Override
    public String getDescricao() {
        return getNome() + (artesanal ? " - Artesanal" : " - Tradicional");
    }
}