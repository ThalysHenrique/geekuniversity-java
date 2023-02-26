package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa69 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

        nomes.sort(comparador);

        // Lambdas (Expressões) -> funções anônimas (forma 1)
//        nomes.forEach((String s) -> {
//            System.out.println(s);
//        });

        // Lambda (forma 2)
        // 1 linha de execução, caso contrário precisaria das { }
        nomes.forEach(s -> System.out.println(s));
    }
}
