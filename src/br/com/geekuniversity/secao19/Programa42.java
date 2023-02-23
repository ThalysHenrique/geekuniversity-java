package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

// Listas -> Collections (Coleção de Dados)
//- Listas possuem tamanho 'infinito' (depende da memória)
//- Aceitam repetição de valores
//- Aceitam objetos (valores) de qualquer tipo, desde que não espeficique o tipo de dado na declaração
public class Programa42 {
    public static void main(String[] args) {
//        ArrayList nomes = new ArrayList(); // Qualquer tipo de dado (Tipo não espeficiado)
        ArrayList<String> nomes = new ArrayList<String>(); // Tipo String definido

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Jax");
        nomes.add("Clay");
//        nomes.add(44);
//        nomes.add(7.5);
//        nomes.add(true);

//        System.out.println(nomes.get(0));

//        for (int i = 0; i < nomes.size(); i++){
//            System.out.println(nomes.get(i));
//        }

        // Função para ordenar por ordem alfabetica
        Collections.sort(nomes);

        // Para cada objeto nome dentro do arraylist nomes imprima o nome
        for (Object nome : nomes) {
            System.out.println(nome);
        }
    }
}
