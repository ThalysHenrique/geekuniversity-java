package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams --> fluxos de dados ou objetos para usar de forma mais criteriosa
// Streams -> os métodos aplicados a este stream não afetam o original
public class Programa74 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));
        cursos.add(new Curso("Programação em Java", 50));
        cursos.add(new Curso("Programação em Python", 30));
        cursos.add(new Curso("Programação para Front-End", 1000));
        cursos.add(new Curso("Programação para Back-End", 120));

        // Imprimir somente os cursos com mais de 100 alunos:
//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); // Lambda
        // Não pode usar o method reference no filter
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println); // Method Reference
    }
}
