package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

// Classes Anônimas
public class Programa67 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() < s2.length()){
                    return -1;
                } else if(s1.length() == s2.length()){
                    return 0;
                } else {
                    return 1;
                }
            }
        };

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

        nomes.sort(comparador);
        System.out.println(nomes);

        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        nomes.forEach(consumidor);
    }
}
