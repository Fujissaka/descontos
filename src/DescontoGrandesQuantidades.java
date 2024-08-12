public class DescontoGrandesQuantidades extends Desconto {
    private double quantidadeMinima;
    private double taxaDesconto;

    public DescontoGrandesQuantidades(Pedido pedido,
        double quantidadeMinima, double taxaDesconto) {
            super(pedido);
            this.quantidadeMinima = quantidadeMinima;
            this.taxaDesconto = taxaDesconto;
    }

    @Override
    public double getDesconto() {
        return (pedido.getQuantidade() >= quantidadeMinima)
            ? pedido.getPrecoTotal() * taxaDesconto
            : 0.0;
    }
}
