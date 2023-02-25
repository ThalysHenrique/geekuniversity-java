package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

// LinkedList
public class Programa56 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        System.out.println(list.size());

        list.add("Volvo");
        System.out.println(list);

        list.add("Bmw");
        System.out.println(list);

        list.add(0, "Honda");
        System.out.println(list);
    }
}
