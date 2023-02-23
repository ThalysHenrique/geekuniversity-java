package br.com.geekuniversity.secao19;

import java.util.*;

// Mapas - Map
//- Mapeia os elementos utilizando o conceito Chave/Valor
//- Conhecidos como se representassem 3 coleções
//- Coleção de Chaves / Valores / Associações
public class Programa48 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(7, "Jones");
        pessoas.put(6, "James");
        pessoas.put(5, "Jim");

        // Coleção de Chaves
        System.out.println("Chaves: " + pessoas.keySet());

        // Coleção de Valores
        System.out.println("Valores: " + pessoas.values());

        // Coleção de Associações
        System.out.println("Associações: " + pessoas.entrySet());

        // Iterar na coleção de chaves

        // Forma 1
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        // Forma 2
        Set<Integer> chaves = pessoas.keySet();
        for(Integer idade : chaves){
            System.out.println(pessoas.get(idade));
        }

        // Iterando na coleção de valores
        Collection<String> valores = pessoas.values();
        for(String nome : valores){
            System.out.println(pessoas.get(nome));
        }

        // Forma 2
        pessoas.values().forEach(nome ->
                System.out.println(nome));

        // Iterar a coleção de associações

        // Forma 1
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for(Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        // Forma 2
        pessoas.entrySet().forEach(associacao ->
                System.out.println(associacao.getKey() + " - " + associacao.getValue()));
    }
}
