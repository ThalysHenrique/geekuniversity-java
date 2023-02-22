package br.com.geekuniversity.secao5;

// For

import java.util.Locale;
import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // variável de controle; condição de parada; forma de incremento
        // i++ -> i = i + 1 ...
        for(int i = 0; i < 5; i++) {
            System.out.print("digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("digite sua idade: ");
            // idade = sc.nextInt(); // Bug
            idade = Integer.parseInt(sc.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        }

        sc.close();
    }
}
