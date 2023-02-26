package br.com.geekuniversity.secao21;


// Listas Duplamente Ligadas
public class Programa57 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Marta");
        System.out.println(lista);
        lista.adiciona("Clara");
        System.out.println(lista);
        lista.adicionaComeco("Jessica");
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.contem("Marta"));
        System.out.println(lista.contem("Jessica"));


    }
}
