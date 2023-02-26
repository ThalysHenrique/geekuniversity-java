package br.com.geekuniversity.secao22;

import java.util.*;

// Default Method
public class Programa64 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");
        System.out.println(nomes);
        Collections.sort(nomes); // Ordena de forma alfábetica
        System.out.println(nomes);

        for(int i = 0; i < nomes.size(); i++){
            System.out.println("A palavra: " + nomes.get(i) + " tem tamanho: " + nomes.get(i).length());
        }

        Comparator<String> comparador = new ComparadorPorTamanho();

        Collections.sort(nomes, comparador);
        System.out.println(nomes);
    }
}
