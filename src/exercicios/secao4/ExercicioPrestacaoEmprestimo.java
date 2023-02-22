package exercicios.secao4;

import java.util.Scanner;

// Leia o salário do trabalhador e o valor da prestação de empréstimo, Se a prestaçao for maior que 20% do salário imprima: Empréstimo nao concedido, caso contrário, empréstimo concedido
public class ExercicioPrestacaoEmprestimo {
    public static void main(String[] args) {

        float salario, prestacaoEmprestimo, calculaSalario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = Float.parseFloat(sc.nextLine());

        System.out.println("Digite o valor da prestaçao do empréstimo: ");
        prestacaoEmprestimo = sc.nextFloat();

        calculaSalario = salario / 5;

        if(prestacaoEmprestimo > calculaSalario){
            System.out.println("Valor da prestaçao maior que 20% do salário: " + prestacaoEmprestimo + "\nEmpréstimo nao concedido!");
        } else {
            System.out.println("Valor da prestaçao menor que 20% do salário: " + prestacaoEmprestimo + "\nEmpréstimo concedido!");
        }

        sc.close();

    }
}
