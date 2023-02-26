package br.com.geekuniversity.secao21;

import java.util.LinkedList;

// Conjuntos --> Não aceitam elementos repetidos
public class Programa62 {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        System.out.println(conjunto);

        conjunto.adiciona("Thalys");
        System.out.println(conjunto);

        conjunto.adiciona("Ana");
        conjunto.adiciona("Barbara");
        conjunto.adiciona("Carol");
        conjunto.adiciona("Daiane");
        System.out.println(conjunto);

        conjunto.adiciona("Julia");
        conjunto.adiciona("Monica");
        System.out.println(conjunto);

        conjunto.adiciona("Jessica");
        System.out.println(conjunto);

    }
}
