package br.com.geekuniversity.secao22;

import java.util.Comparator;

// Comparador de Strings para que seja possível ordenar a string pelo tamanho ao inves de ordem alfábetica
public class ComparadorPorTamanho implements Comparator<String> {
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
}
