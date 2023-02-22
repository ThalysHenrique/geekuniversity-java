package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

// Escrita em arquivos 2
public class Programa41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));

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
