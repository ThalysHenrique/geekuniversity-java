package exercicios.secao3;

import java.util.Scanner;

// Usuario digita 3 numeros e imprime a soma deles
public class ExercicioSoma {
    public static void main(String[] args) {

        int num1, num2, num3;
        int soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero 1:");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o numero 2:");
        num2 = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o numero 3:");
        num3 = Integer.parseInt(sc.nextLine());

        soma = num1 + num2 + num3;

        System.out.println("Resultado: " + soma);

        sc.close();
    }
}
