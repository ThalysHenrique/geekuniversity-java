package exercicios.secao4;

import java.util.Scanner;

// Recebe dois números, mostra o maior e se forem iguais informe que sao iguais
public class ExercicioNumerosIguais {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o número 2: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é o maior!");
        } else if (num1 == num2){
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("O número " + num2 + " é o maior!");
        }

        sc.close();
    }
}
