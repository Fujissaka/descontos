public class PedidoEncomenda extends Pedido {
    private String endereco;
    private double frete;

    public PedidoEncomenda(int quantidade, double precoUnitario, Cliente cliente, Pedido.MeioPagamento meioPagamento,
            String endereco, double frete) {
        super(quantidade, precoUnitario, cliente, meioPagamento);
        this.endereco = endereco;
        this.frete = frete;
    }

    @Override
    public double getPrecoFinal() {
        return super.getPrecoFinal() + frete;
    }    
}
