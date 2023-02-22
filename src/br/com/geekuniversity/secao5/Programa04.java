package br.com.geekuniversity.secao5;

import java.util.Locale;
import java.util.Scanner;

// While
public class Programa04 {
    public static void main(String[] args) {

        int idade = 1;
        String nome;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Sempre checa o valor antes de executar o bloco
            while (idade > 0) {
            System.out.print("digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("digite sua idade: ");
            // idade = sc.nextInt(); // Bug
            idade = Integer.parseInt(sc.nextLine());

            System.out.println(nome + " tem " + idade + " anos");
        }

        sc.close();

    }
}
