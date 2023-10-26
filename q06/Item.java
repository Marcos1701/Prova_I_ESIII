package q06;

public class Item {
    private String id;
    private String descricao;
    private double valor;

    Item(String idString, String descricaoString, double valor){
        this.id = idString;
        this.descricao = descricaoString;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
