package q02;

public class RedeSocial {
    public void postarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().equals("")) {
            // espera e tenta novamente
            // System.out.println("A mensagem não pode ser vazia...");
            throw new Error("A mensagem não pode ser vazia...");
        }

        System.out.println("Mensagem postada: " + mensagem);   
    }
}

