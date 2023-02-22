package br.com.geekuniversity.secao4;

import java.util.Locale;
import java.util.Scanner;

// Switch Case
public class Programa03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
//        int num = 0;

        System.out.print("digite um numero: ");
        int num;
        num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("num 0");
                break;
            case 1:
                System.out.println("num 1");
                break;
            case 2:
                System.out.println("num 2");
                break;
            default:
                System.out.println("num nao identificado");
                break;
        }


        sc.close();
    }
}
