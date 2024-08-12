public class DescontoCompreAlgumGanheUm extends Desconto {
    private int quantidadeMinima;

    public DescontoCompreAlgumGanheUm(Pedido pedido, int quantidadeMinima) {
        super(pedido);
        this.quantidadeMinima = quantidadeMinima;
    }

    @Override
    public double getDesconto() {
        return pedido.getQuantidade() / quantidadeMinima 
            * pedido.getPrecoUnitario();
    }
}
