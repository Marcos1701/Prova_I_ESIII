package q02;

public class Teste {
    public static void main(String[] args) {
        RedeSocial r1 = new RedeSocial();

        r1.postarMensagem("oi!"); // "Mensagem postada: oi!"
        r1.postarMensagem(null); // "A mensagem não pode ser vazia..."
    }
}
