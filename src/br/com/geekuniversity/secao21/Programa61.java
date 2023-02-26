package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

// Fila -> Implementação do Java Queue
public class Programa61 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        fila.add("Jax");
        fila.add("Carl");
        System.out.println(fila);

        String remove = fila.poll();
        System.out.println(remove);
        System.out.println(fila);

        System.out.println(fila.peek());

        fila.poll();
        System.out.println(fila);
        System.out.println(fila.peek());


    }
}
