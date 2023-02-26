package br.com.geekuniversity.secao21;

// Filas
public class Programa60 {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila);
        System.out.println(fila.vazia());

        fila.adiciona("Thalys");
        fila.adiciona("Henrique");
        fila.adiciona("Xandao");
        System.out.println(fila);

        String remove = fila.remove();
        System.out.println(remove);
        System.out.println(fila);

        System.out.println(fila.vazia());

        fila.remove();
        fila.remove();
        fila.remove();


    }
}
