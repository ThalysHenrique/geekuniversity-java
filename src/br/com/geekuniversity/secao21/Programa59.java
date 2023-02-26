package br.com.geekuniversity.secao21;

import java.util.Stack;

// Pilhas - Implementação do Java
public class Programa59 {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        // Método Insere
        nomes.push("Carl");
        nomes.push("Johnson");
        System.out.println(nomes);

        // Método remove
        String remove = nomes.pop();
        System.out.println(remove);
        System.out.println(nomes);

        nomes.push("Jax");
        nomes.push("Clay");
        System.out.println(nomes);

        System.out.println(nomes.peek());

    }
}
