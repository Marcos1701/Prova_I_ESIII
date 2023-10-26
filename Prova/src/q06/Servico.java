package q06;

import q06.Totalizacao.Totalizavel;

public class Servico extends Item implements Totalizavel
{
    
    private int horas;

    public Servico(String id, String descricao, double valor, int horas) {
        super(id, descricao, valor);
        this.horas = horas;
    }
    
    @Override
    public double calcularTotal() {
        return this.getValor() * this.getHoras();
    }
    
    public int getHoras() {
        return horas;
    }
}
