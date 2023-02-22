package exercicios.secao4;

import java.util.Scanner;

// Programa recebe dois números e mostra o maior
public class ExercicioMaiorNumero {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um número: ");
        num2 = Integer.parseInt(sc.nextLine());

        if(num1 > num2){
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

        sc.close();

    }
}
