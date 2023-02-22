package br.com.geekuniversity.secao6;

// Operações matemáticas
public class Programa12 {
    public static void main(String[] args) {

        int num1 = 5, num2 = 9, resposta;
        float resposta2;

        // Soma
        resposta = num1 + num2;
        System.out.println("Resultado da soma: " + resposta);

        // Subtração
        resposta = num1 - num2;
        System.out.println("Resposta da subtração: " + resposta);

        // Multiplicação
        resposta = num1 * num2;
        System.out.println("Resultado da multiplicação: " + resposta);

        // Divisão (Inteira)
        resposta = num1 / num2;
        System.out.println("Resultado da divisão: " + resposta);

        // Divisão (Real)
        resposta2 = (float)num2 / (float)num1;
        System.out.println("Resultado da divisão real: " + resposta2);

        // Se o resto da divisão por 2 for 0, é par, 1 é ímpar
        // Módulo
        resposta = num1 % 2;
        System.out.println("Resultado do resto da divisão de: " + num1 + " é: " + resposta);

        // Se o resto da divisão por 3 for 0, o número é divisível por ele mesmo, 1 não é
        resposta = num2 % 3;

        if(resposta == 0){
            System.out.println("É divisível!");
        } else {
            System.out.println("Não é divisível!");
        }

        System.out.println(num2 + " é divisível? " + resposta);

    }
}
