package br.com.geekuniversity.secao6;

// Tipos de dados alfanuméricos
// Caracteres e strings
public class Programa10 {
    public static void main(String[] args) {

        // Tipos primitivos
        char letra1 = 'a';
        char letra2 = 97; // 97 em decimal == a
        // char letraTeste = "a"; -> em java, aspas duplas é uma string
        // string -> não existe o tipo primitivo string em java

        System.out.println("Letra: " + letra2);

        letra2 = (char) (letra2 + 1); // cast

        System.out.println("Letra: " + letra1);
        System.out.println("Letra: " + letra2);

        // Tipos não primitivos
        Character letra3 = 'A';
        String nome = "Geek University";

        System.out.println("Letra: " + letra3);
        System.out.println("Nome: " + nome);

        System.out.println("char/Character: " + Character.SIZE + " bits");

        System.out.println("Valor minímo char/Character: " + Character.MIN_VALUE); // 0
        System.out.println("Valor máximo char/Character: " + Character.MAX_VALUE); // 65535

        // System.out.println("Nome: " + String.SIZE); // por debaixo dos panos o java cria um vetor de caracteres, por isso não existe essa funçao para String
        System.out.println("Quantidade de caracteres: " + nome.length());
        System.out.println("Nome: " + (Character.SIZE * nome.length()) + " bits");
    }
}
