package exercicios.secao4;

import java.util.Scanner;

// Leia um número, Se positivo -> imprime o número ao quadrado e a raiz quadrada
public class ExercicioRaizQuadrada3 {
    public static void main(String[] args) {

        float num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());

        if(num > 0){
            System.out.printf("Número ao quadrado: %.2f", Math.pow(num, 2));
            System.out.printf("\nRaiz quadrada: %.2f", Math.sqrt(num));
        } else {
            System.out.println("Número inválido!");
        }

        sc.close();
    }
}
