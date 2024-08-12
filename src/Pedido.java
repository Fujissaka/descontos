import java.util.ArrayList;

public class Pedido {
    private int quantidade;
    private double precoUnitario;
    private Cliente cliente;
    private ArrayList<Desconto> descontos;
    private MeioPagamento meioPagamento;

    public enum MeioPagamento {
        DINHEIRO, PIX, CARTAO
    }

    public Pedido(int quantidade, double precoUnitario, Cliente cliente,
        MeioPagamento meioPagamento) {
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
            this.cliente = cliente;
            this.meioPagamento = meioPagamento;
            this.descontos = new ArrayList<Desconto>();
        
        if (cliente.isFidelidade()) {
            descontos.add(new DescontoFixo(this, descontos))
        }
    }

    public void addDesconto(Desconto desconto) {
        descontos.add(desconto);
    }

    public double getPrecoTotal() {
        return quantidade * precoUnitario;
    }

    public double getDescontoTotal() {
        double total = 0.0;

        for (Desconto desconto : descontos) {
            total += desconto.getDesconto();
        }
        return total;
    }
    /**
     * Calcula o preço final (com descontos ou acréscimos)
     * a ser pago pelo cliente.
     * 
     * @return o preço final
     */
    public double precoFinal() {
        return getPreçoTotal()
    }
    public double getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
