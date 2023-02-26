package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");
        nomes.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
