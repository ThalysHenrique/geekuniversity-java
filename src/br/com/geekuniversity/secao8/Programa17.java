package br.com.geekuniversity.secao8;

import java.util.Scanner;

// Criando funçoes
// Faça um programa que receba diversos nomes de frutas do usuário e ao final imprima essas frutas em ordem contrária e deve perguntar ao usuário quantas frutas ele quer informar
public class Programa17 {

    // Variável global
    // Declaraçao de vetor
    static String frutas[];
    static Scanner sc = new Scanner(System.in);

    // Funçao MAIN obrigatoriamente deve ser static
    public static void main(String[] args) {

        // Variável local
        int qtdFrutas;

        System.out.println("Quantas frutas voce quer informar? ");
        qtdFrutas = Integer.parseInt(sc.nextLine());

        cadastraDados(qtdFrutas);
        mostraDados(qtdFrutas);

        sc.close();
    }

    // Uma funçao deve ter o seguinte:
    // a) Tipo de retorno (tipo de dado que a função vai retornar)
    // b) Nome
    // c) Parâmetros/Argumentos de entrada (Opcional)
    // d) Retorno (Opcional - depende do tipo de retorno)
    static void cadastraDados(int quantidade) {

        // Definindo tamanho do vetor
        frutas = new String[quantidade];

        for(int i = 0; i < quantidade; i++) { // i++ -> i + 1
            System.out.print("Informe o nome de uma fruta: ");
            frutas[i] = sc.nextLine();
        }
    }

    static void mostraDados(int quantidade) {

        for(int i = (quantidade - 1); i >= 0; i--){ // i-- -> i - 1
            System.out.println("Frutas informadas: " + frutas[i]);
        }

    }
}
