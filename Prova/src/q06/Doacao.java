package q06;

import q06.Totalizacao.Totalizavel;

public class Doacao  extends Item implements Totalizavel
{
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        super(id, descricao, valor);
        this.bonus = bonus;
    }

    @Override
    public double calcularTotal() {
        return this.getValor() + this.getBonus();
    }

    public double getBonus() {
        return bonus;
    }
}