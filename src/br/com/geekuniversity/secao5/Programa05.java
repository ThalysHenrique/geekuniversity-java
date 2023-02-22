package br.com.geekuniversity.secao5;

// Do while

import java.util.Locale;
import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Primeiro executa o bloco e depois faz a chegagem
        do {
            System.out.print("digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("digite sua idade: ");
            // idade = sc.nextInt(); // Bug
            idade = Integer.parseInt(sc.nextLine());

            if(idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        } while (idade > 0);

        sc.close();
    }
}
