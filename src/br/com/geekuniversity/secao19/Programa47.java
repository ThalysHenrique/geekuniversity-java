package br.com.geekuniversity.secao19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Conjuntos -> implementados com a interface Set, e uma das classes que implementam é a HashSet
// A maioria das coleções possuem os mesmos métodos utilizados com as listas, mas com comportamentos diferentes
// Conjunto é melhor em performance, superior a listas
// Não aceitam valores repetidos, nem ordenação
// Ordem de inserção não é respeitada (Realiza uma semi-ordenação)
// Não possui índice
public class Programa47 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        int num;
        boolean res;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos nomes você quer adicionar na lista: ");
        num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < num; i++){
            System.out.print("Informe o " + (i+1) + "/" + num + " nome: ");
            String nome = sc.nextLine();
            res = nomes.add(nome);
            if(!res){
                System.out.println("Esse nome já existe, por favor informe outro nome...");
                i--;
            }
            System.out.println("Nomes adicionados com sucesso!");
        }
            System.out.println("Lista com os nomes adicionados: ");
        for(String nome : nomes){
            System.out.println("- " + nome);
        }
        sc.close();
    }
}
