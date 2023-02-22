package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa34 {
    static float num1 = 0;
    static float num2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe o primeiro número para divisão: ");
            num1 = Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Você precisa digitar um número!");
        }

        try {
            System.out.println("Informe o segundo número para divisão: ");
            num2 = Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Você precisa digitar um número!");
        }

        try {
            System.out.printf("A divisão de: %.2f" , num1 , " por " , num2 + " é: " , num1 / num2);
        } catch (ArithmeticException e){
            System.out.println("Não é possível dividir " + num1 + " por 0.");
        }

        sc.close();
    }
}
