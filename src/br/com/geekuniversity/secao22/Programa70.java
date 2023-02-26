package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Lambda
public class Programa70{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

        // Comparator (Forma 1)
//        nomes.sort((s1, s2) -> {
//            if(s1.length() < s2.length()){
//                return -1;
//            } else if(s1.length() == s2.length()){
//                return 0;
//            } else {
//                return 1;
//            }
//        });

        // Comparator -> Forma 2
        nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Consumer
        nomes.forEach(s -> System.out.println(s));
    }
}
