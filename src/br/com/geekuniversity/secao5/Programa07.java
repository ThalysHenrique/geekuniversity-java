package br.com.geekuniversity.secao5;

// Foreach -> Para cada
public class Programa07 {
    public static void main(String[] args) {

        String nome = "Geek University";

        // Para cada um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()) {
            System.out.print(letra);
         // System.out.println(letra);
        }

    }
}
