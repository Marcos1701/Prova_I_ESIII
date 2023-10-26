package q06;

import java.util.List;

import q06.Totalizacao.Totalizavel;

public class Teste {
    public static void main(String[] args) {

        try{
            Totalizacao t = new Totalizacao();
            Doacao d1 = new Doacao("1", "sla", 10, 0.1);
            Produto p1 = new Produto("1", "produto 1", 20, 0.3);
            Servico s1 = new Servico("1", "Serviço 1", 50, 5);
            Totalizavel[] itens = {d1, p1, s1};
            if (t.totalizar(itens) != (d1.calcularTotal() + p1.calcularTotal() + s1.calcularTotal())) {
                throw new Error("Valores não batem!!");
            }
        
            System.out.println("Deu tudo Certo!!");
        }catch(Exception e){
            System.out.println("Um erro ocorreu: " + e.getMessage());
        }
    }
}
