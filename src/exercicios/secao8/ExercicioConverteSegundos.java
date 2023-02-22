package exercicios.secao8;

import java.util.Scanner;

// Crie uma funçao que receba 3 números inteiros sendo eles: horas, minutos e segundos e converta em segundos
public class ExercicioConverteSegundos {
    public static void main(String[] args) {

        int horas, minutos, segundos, converte;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        horas = Integer.parseInt(sc.nextLine());

        System.out.println("Digite os minutos: ");
        minutos = Integer.parseInt(sc.nextLine());

        System.out.println("Digite os segundos: ");
        segundos = Integer.parseInt(sc.nextLine());

        converte = (horas + minutos + segundos) * 60;

        System.out.println("A soma de " + horas + " + " + minutos + " + " + segundos + " convertendo para segundos: " + converte + " segundos...");

        sc.close();

    }
}
