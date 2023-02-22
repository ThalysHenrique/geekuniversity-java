package exercicios.secao8;

import java.util.Scanner;

// Crie uma funçao que verifica se o número é positivo ou negativo, Se positivo retorna 1, Se negativo retorna -1, Se 0 retorna 0
public class ExercicioVerifica {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("1");
        } else if(num == 0){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

        sc.close();
    }
}
