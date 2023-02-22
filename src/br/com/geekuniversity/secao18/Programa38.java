package br.com.geekuniversity.secao18;

// Strings -> são imutáveis, não mudam
public class Programa38 {
    public static void main(String[] args) {
        String curso = "Programação em Java Essencial";

        curso.replace("Java", "Python"); // Se encontrar, altera a primeira palavra pela segunda
        System.out.println(curso); // imutáveis

        curso = curso.replace("Java", "Python");
        System.out.println(curso);

        curso = curso.toLowerCase();
        System.out.println(curso);

        curso = curso.toUpperCase();
        System.out.println(curso);

        System.out.println(curso.charAt(0));

        curso = curso.trim();
        System.out.println(curso);

        for(int i = 0; i < curso.length(); i++){
            System.out.print(curso.charAt(i));
        }

        for(int i = (curso.length() -1 ); i >= 0; i--){
            System.out.print(curso.charAt(i));
        }
    }
}
