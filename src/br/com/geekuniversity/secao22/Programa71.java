package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Lambdas
public class Programa71 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

        nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        nomes.forEach(s -> System.out.println(s));
    }
}
