package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Streams
public class Programa78 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));
        cursos.add(new Curso("Programação em Java", 50));
        cursos.add(new Curso("Programação em Python", 30));
        cursos.add(new Curso("Programação para Front-End", 1000));
        cursos.add(new Curso("Programação para Back-End", 120));

//        List<Curso> resultado = cursos.stream().filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());
//
//        resultado.forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
    }
}
