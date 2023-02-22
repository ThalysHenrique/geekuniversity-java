package br.com.geekuniversity.secao17;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.Scanner;

// Gerando executáveis JAR
//- Java Archive -> Compactado Java
public class Principal {

    static Cliente cliente = new Cliente("Lebron", "EUA");
    static Conta conta = new Conta(1, 300, 500, cliente);
    static Scanner sc = new Scanner(System.in);

    /**
     * Método para realizar depósito
     */
    public static void depositar(){
        System.out.println("=== Depósito ===");
        System.out.println("Informe o valor para depósito: ");
        float valor = sc.nextFloat();
        if(valor > 0){
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("O valor precisa ser positivo!");
        }
    }

    public static void sacar(){
        System.out.println("=== Saque ===");
        System.out.println("Informe o valor para sacar: ");
        float valorSaque = sc.nextFloat();
        if(valorSaque > 0){
            conta.sacar(valorSaque);
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Valor precisa ser positivo!");
        }
    }

    public static void consultar(){
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }

    public static void main(String[] args) {

        int opcao = 0;
        System.out.println("Bem-vindo ao Banco Geek!");

        do {
            System.out.println("Selecione uma opção abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

        switch (opcao){
            case 1:
                depositar();
                break;
            case 2:
                sacar();
                break;
            case 3:
                consultar();
                break;
            case 0:
                System.out.println("Volte sempre!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
        } while (opcao > 0);
        sc.close();

    }
}
