package q01;

public class ClienteService {
    public void processarPedido(Pedido pedido) {
        calcularDesconto(pedido);
    }

    public double calcularDesconto(Pedido pedido) {
        return pedido.getDesconto();
    }
}
