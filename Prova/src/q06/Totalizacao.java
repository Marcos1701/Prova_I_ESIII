package q06;


public class Totalizacao {

    public interface Totalizavel {
        double calcularTotal();
    }

    public double totalizar(Totalizavel[] itens) {
        double total = 0;
        for (Totalizavel item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }
}
