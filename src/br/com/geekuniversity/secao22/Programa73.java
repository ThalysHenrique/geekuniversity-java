package br.com.geekuniversity.secao22;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Revisão: Classes anônimas, lambdas e methods references
public class Programa73 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        // Classes anônimas
        cursos.add(new Curso("Programação para Leigos", 200));
        cursos.add(new Curso("Programação para Intermediários", 150));
        cursos.add(new Curso("Programação para Experts", 100));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos())); // Lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); // Method Reference

//        cursos.forEach(c -> System.out.println(c.getNome())); // Lambda
        cursos.forEach(System.out::println); // Method Reference
    }
}
