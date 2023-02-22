package br.com.geekuniversity.secao6;

// Tipos de dados booleanos
// True and False
public class Programa11 {
    public static void main(String[] args) {

        // Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        boolean ativo = true;

        // Tipos não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("V: " + v);
        System.out.println("F: " + f);

        // Boolean.SIZE -> não existe -> 0 ou 1

        if(verdadeiro){
            System.out.println("É Verdadeiro!");
        } else {
            System.out.println("É Falso!");
        }

        if(1 == 3){
            System.out.println("1 == 3 é verdadeiro!");
        } else {
            System.out.println("1 == 3 é falso!");
        }

        if(ativo){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
