package q01;
import java.util.List;
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;
    private ClienteService service;

    Cliente(String nome) {
        this.nome = nome;
    }

    public void AdicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        service.processarPedido(pedido);
    }

    public double calcularDesconto(Pedido pedido) {
        return service.calcularDesconto(pedido);
    }
}

