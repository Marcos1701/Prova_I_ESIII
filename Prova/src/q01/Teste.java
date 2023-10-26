package q01;

public class Teste {
    public static void main(String[] args) {
        try{
            Cliente c1 = new Cliente("Marcos Neiva");
            Pedido p1 = new Pedido(100, c1);

            c1.AdicionarPedido(p1);

            if(c1.calcularDesconto(p1) != p1.getDesconto()){
                throw new Error("O valores não batem");
            }
            System.out.println("Os valores estão corretos!");
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
