package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Stream + Thread (paralelismo)
// Útil para milhões / bilhões de dados
// Não é recomendado para quantidade pequena de dados
public class Programa79 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));
        cursos.add(new Curso("Programação em Java", 50));
        cursos.add(new Curso("Programação em Python", 30));
        cursos.add(new Curso("Programação para Front-End", 1000));
        cursos.add(new Curso("Programação para Back-End", 120));

        cursos.parallelStream()// Stream + Thread
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
    }
}
