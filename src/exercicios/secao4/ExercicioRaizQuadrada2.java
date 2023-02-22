package exercicios.secao4;

import java.util.Scanner;

// Ler um número real, Se positivo -> imprime a raiz quadrada, Se negativo imprime número ao quadrado
public class ExercicioRaizQuadrada2 {
    public static void main(String[] args) {

        float num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());

        if(num > 0){
            // Math.sqrt -> Funçao para calcular a raiz quadrada
            System.out.printf("Raiz quadrada: %.2f", Math.sqrt(num));
        } else {
            // Math.pow -> funçao para calcular um número ao quadrado
            System.out.println("Número ao quadrado: " + Math.pow(num, 2));
        }

        sc.close();
    }
}
