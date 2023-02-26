package br.com.geekuniversity.secao21;

import java.util.HashSet;
import java.util.Set;

// Implementação de Conjuntos do Java
public class Programa63 {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<String>();

        System.out.println(conjunto);

        conjunto.add("Julia");
        System.out.println(conjunto);
        conjunto.add("Thalys");
        conjunto.add("Ana");
        conjunto.add("Bruna");
        conjunto.add("Bruna");
        System.out.println(conjunto);

        conjunto.remove("Bruna");
        System.out.println(conjunto);

        conjunto.add("Taylor");
        System.out.println(conjunto);


    }
}
