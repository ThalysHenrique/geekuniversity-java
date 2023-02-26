package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// forEach
public class Programa66 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        Consumer<String> consumidor = new ImprimeNaLinha();

        nomes.add("Thalys");
        nomes.add("Henrique");
        nomes.add("Ana");
        nomes.add("Whindersson");
        nomes.add("Notebook Lenovo");
        nomes.add("Honda Civic");
        nomes.add("Desenvolvedor Back-End");

//        for(int i = 0; i < nomes.size(); i++){
//            System.out.print(nomes.get(i));
//        }
//
//        for(String n : nomes){
//            System.out.print("\n" + n);
//        }

        nomes.forEach(consumidor);
    }
}
