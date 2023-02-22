package exercicios.secao4;

import java.util.Scanner;

// Leia 2 notas, verifique se sao válidas (0.0 à 10.0) e exiba a média das notas, se não forem válidas informe ao usuário
public class ExercicioNotas {
    public static void main(String[] args) {

        float n1 = 0, n2 = 0;
        float media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        n1 = Float.parseFloat(sc.nextLine());

        System.out.println("Digite a nota 2: ");
        n2 = Float.parseFloat(sc.nextLine());

        if(n1 > 0 && n1 <= 10 && n2 > 0 && n2 <= 10){
            media = (n1 + n2) / 2;
            System.out.println("A média das notas do aluno é: " + media);
        } else {
            System.out.println("Números inválidos, média nao pode ser calculada!");
        }

        sc.close();
    }
}
