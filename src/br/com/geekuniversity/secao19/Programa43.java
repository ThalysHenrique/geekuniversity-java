package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Programa43 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(7);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(0);

        Collections.sort(numbers);

        for(Object number : numbers){
            System.out.println(number);
        }
    }
}
