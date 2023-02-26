package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

// Methods References (SIMPLIFICAÇÕES DO MÉTODO LAMBDA)
public class Programa72 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

        // Expressão Lambda Simplificado
//        nomes.sort(Comparator.comparing(s -> s.length()));
//        System.out.println(nomes);

        // Method Reference - Forma 1 -> Melhor forma!
        nomes.sort(Comparator.comparing(String::length));

        // Method Reference - Forma 2
//        Function<String, Integer> tamanho = String::length; // Usando Method Reference
//        Function<String, Integer> tamanho = s -> s.length(); // Usando expressão lambda
//        Comparator<String> comparador = Comparator.comparing(tamanho);
//        nomes.sort(comparador);

        nomes.forEach(System.out::println);
    }
}
