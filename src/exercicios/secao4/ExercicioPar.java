package exercicios.secao4;

import java.util.Scanner;

// Recebe um número e verifica se é par ou ímpar
public class ExercicioPar {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }

        sc.close();
    }
}
