package exercicios.secao4;

import java.util.Scanner;

// Leia um número fornecido pelo usuário. Se for positivo, calcule a raiz quadrada desse número, Se negativo mostre número inválido
public class ExercicioRaizQuadrada {
    public static void main(String[] args) {

        int num;
        int calculoRaiz;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());

        if(num > 0){
            System.out.println("Raiz quadrada: " + Math.sqrt(num));
        } else {
            System.out.println("Número inválido!");
        }

        sc.close();

    }
}
