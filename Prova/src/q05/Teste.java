package q05;

import java.io.IOException;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        try {
            Transacao t1 = new Transacao(1200, new Date(), "DEPOSITO");
            Transacao t2 = new Transacao(100, new Date(), "TRANSFERENCIA");
            Transacao t3 = new Transacao(100, new Date(), "RETIRADA");

            t1.calculaTaxa();
            t2.calculaTaxa();
            t3.calculaTaxa();

            t1.salvarTransacao();
            t2.salvarTransacao();
            t3.salvarTransacao();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
