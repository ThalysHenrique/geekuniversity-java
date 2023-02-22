package exercicios.secao4;

import java.util.Scanner;

// Receba dois números inteiros, mostre na tela o maior e mostre a diferença entre eles
public class ExercicioDiferencaNumero {
    public static void main(String[] args) {

        int num1, num2;
        int verificaDiferenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite mais um número: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é o maior!");
        } else {
            System.out.println("O número " + num2 + " é o maior!");
        }

        verificaDiferenca = num1 - num2;

        System.out.println("A diferença entre eles é: " + verificaDiferenca);

        sc.close();
    }
}
