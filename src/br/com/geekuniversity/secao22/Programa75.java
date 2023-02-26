package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams
public class Programa75 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));
        cursos.add(new Curso("Programação em Java", 50));
        cursos.add(new Curso("Programação em Python", 30));
        cursos.add(new Curso("Programação para Front-End", 1000));
        cursos.add(new Curso("Programação para Back-End", 120));

        // Transforma a coleção de Cursos em Streams
        cursos.stream()
                // Filtra os cursos que possuem mais de 100 alunos
                .filter(c -> c.getAlunos() >= 100)
                // Mapeia um tipo de dado para outro (Recebe Curso e retorna um int)
                .map(Curso::getAlunos)
                // Imprime o resultado
                .forEach(System.out::println);
    }
}
