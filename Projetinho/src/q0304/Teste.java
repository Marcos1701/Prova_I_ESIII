package q0304;

class Teste {
    public static void main(String[] args) {

        Carro c = new Carro(0, 50);
        c.reabastecerSeNecessario(10); // Carro reabastecido, quantidade de Combustivel Atual: 10.0

        c.reabastecerSeNecessario(200); // Capacidade máxima do tanque ultrapassada.
        
    }
}