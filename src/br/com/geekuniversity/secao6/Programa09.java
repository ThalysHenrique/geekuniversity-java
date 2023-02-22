package br.com.geekuniversity.secao6;

// Tipo de dados
// Numéricos (Inteiros e Reais)
public class Programa09 {
    public static void main(String[] args) {

        // Tipos primários/primitivos
        // Por padrao, os números reais em java sao considerados double
        float preco1 = 23.4f; // ocupa menos espaço em memória -> 23.40
        double preco2 = 23.4; // ocupa mais espaço -> 23.40555333333

        // Tipos nao primários/primitivos
        Float preco3 = 45.40f;
        Double preco4 = 45.40;

        System.out.println("\nfloat -> preço1: " + preco1 + "\ndouble -> preço2: " + preco2 + "\nFloat -> preço3: " + preco3 + "\nDouble -> preço4: " + preco4);

    }

}
