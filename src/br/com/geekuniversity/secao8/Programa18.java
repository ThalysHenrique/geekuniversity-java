package br.com.geekuniversity.secao8;


// Funçoes pt 2
public class Programa18 {
    public static void main(String[] args) {

        int valor1 = 6, valor2 = 7, resposta;

//        resposta = soma(valor1, valor2);
//        System.out.println("Resposta: " + resposta);

        System.out.println("Resposta: " + soma(valor1, valor2, "Bem-vindo!"));

        System.out.println(mensagem());

    }

    static int soma(int v1, int v2, String msg) {
        System.out.println(msg);
        return v1 + v2;
    }

    static String mensagem() {
        return "Olá mundo!";
    }
}
