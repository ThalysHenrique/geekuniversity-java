package br.com.geekuniversity.secao16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa35 {

    static int n1 =0, n2 = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o número 1: ");
            n1 = sc.nextInt();

            System.out.println("Digite o número 2: ");
            n2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Você deve utilizar apenas números inteiros!");
            }

        try {
            System.out.println("Resultado da divisão: " + divisao(n1, n2));
        }  catch (ArithmeticException e) {
            System.out.println("Não foi possível realizar a divisão!");
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a operação!");
        }

        sc.close();
    }
    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }
}
