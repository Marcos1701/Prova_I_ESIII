package q05;

import java.util.Date;

public class Transacao {
    private double valor;
    private Date data;
    private String tipo; // Tipos: DEPOSITO, RETIRADA, TRANSFERENCIA...
    private CalculaTaxa calculaTaxa;
    private SalvaTransacao salvaTransacao;

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public Transacao(double valor, Date data, String tipo) {
        
    }
    
    public void salvarTransacao() {
        salvaTransacao.salvarTransacao(this);
    }

    public double calculaTaxa() {
        return calculaTaxa.calcularTaxas(this);
    }
}
