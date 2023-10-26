package q06;

import q06.Totalizacao.Totalizavel;

public class Produto  extends Item implements Totalizavel
{ 
    private double taxa;

    public Produto(String id, String descricao, double valor, double taxa) {
        super(id, descricao, valor);
        this.taxa = taxa;
    }

    @Override
    public double calcularTotal() {
        return this.getValor() * (1 + this.getTaxa());
    }

    public double getTaxa() {
        return taxa;
    }
}
