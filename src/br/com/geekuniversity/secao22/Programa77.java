package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams
public class Programa77 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));
        cursos.add(new Curso("Programação em Java", 50));
        cursos.add(new Curso("Programação em Python", 30));
        cursos.add(new Curso("Programação para Front-End", 1000));
        cursos.add(new Curso("Programação para Back-End", 120));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()// Pega qualquer um de acordo com o filtro
                .ifPresent(System.out::println); // Imprime se encontrar
    }
}
