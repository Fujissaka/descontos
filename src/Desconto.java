public abstract class Desconto {
    protected Pedido pedido;

    public Desconto(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract double getDesconto();
}
