package q0304;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; // em litros

    Carro(double qtd_combustivel, double cap_max){
        quantidadeCombustivel = qtd_combustivel;
        capacidadeMaxima = cap_max;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void reabastecerSeNecessario(int quantidade) {
        if (this.getQuantidadeCombustivel() >= this.getCapacidadeMaxima() * 0.1 || (this.getQuantidadeCombustivel() + quantidade) > this.getCapacidadeMaxima()) {
            throw new Error("Capacidade máxima do tanque ultrapassada.");
        }
        this.quantidadeCombustivel += quantidade;
        System.out.println("Carro reabastecido, quantidade de Combustivel Atual: " + this.quantidadeCombustivel);
    }
}

