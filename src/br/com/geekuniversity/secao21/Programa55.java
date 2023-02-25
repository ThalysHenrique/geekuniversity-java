package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;
import com.sun.security.jgss.GSSUtil;

import java.util.List;

// Lista Ligada // LinkedList
//- Em um vetor os elementos estão um do lado do outro, enquanto em uma lista ligada estão em lugares diferentes,
// porém um aponta para o outro indicando o proximo elemento
// [0][3][1][4][2]
public class Programa55 {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();
        System.out.println(lista);
        lista.adiciona("Marta");
        System.out.println(lista);
        lista.adiciona("Clara");
        System.out.println(lista);
        lista.adicionaComeco("Jessica");
        System.out.println(lista);
        lista.adiciona(2, "Leticia");
        System.out.println(lista);

        Object obj = lista.pega(2);
        System.out.println(obj);

        System.out.println(lista.tamanho());

        lista.removeComeco();
        System.out.println(lista);
        lista.removeComeco();
        System.out.println(lista);
        lista.removeComeco();
        System.out.println(lista);
        lista.removeComeco();
        System.out.println(lista);
        lista.removeComeco();
        System.out.println(lista);
    }
}
