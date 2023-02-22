package br.com.geekuniversity.secao7;

// Vetores pt 2
public class Programa14 {
    public static void main(String[] args) {

        // Declaração e definição de tamanho do vetor
        int numeros[] = new int[10];

        System.out.println("Tamanho do vetor: " + numeros.length);

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3;
        }

        System.out.println(numeros[0]); // primeiro elemento
        System.out.println(numeros[9]); // último elemento

        // Vetores/Arrays possuem tamanhos fixos e não podem ser aumentados/diminuídos
        // Não aceitam tipos variados

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 10);
        }

        System.out.println(numeros[0]); // primeiro elemento
        System.out.println(numeros[9]); // último elemento

        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
