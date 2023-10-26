package q01;
public class Pedido {
    private double valorTotal;
    private Cliente cliente;

    Pedido(double valorTotal, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getDesconto(){
        return this.valorTotal * 0.1;
    }
}
