public class DescontoFixo extends Desconto {
    private double taxaDesconto;

    public DescontoFixo(Pedido pedido, double taxaDesconto) {
        super(pedido);
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public double getDesconto() {
        return pedido.getPrecoTotal() * taxaDesconto;
    }
}
