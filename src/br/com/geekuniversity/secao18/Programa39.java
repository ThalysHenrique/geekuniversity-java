package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Escrevendo em arquivos
public class Programa39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Toda vez que o programa é executado, a informação é excluída, recomeçando um arquivo zerado
            PrintStream escrever = new PrintStream("saida.txt");

            System.out.println("Digite sua mensagem aqui: ");
            String msg = sc.nextLine();
            escrever.println(msg);
            escrever.close();
        } catch (FileNotFoundException e){
            System.out.println("Não foi possível criar o arquivo");
        }
        sc.close();
    }
}
