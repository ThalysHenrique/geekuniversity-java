package br.com.geekuniversity.secao21;

// Armazenamento Sequencial
public class Programa53 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Neil");
        Aluno a2 = new Aluno("Jow");
        Aluno a3 = new Aluno("Jay");
        Aluno a4 = new Aluno("Jones");

        Vetor lista = new Vetor();

        System.out.println("Tamanho da lista de alunos: " + lista.tamanho());

        lista.adiciona(a1);
        System.out.println("Tamanho da lista de alunos: " + lista.tamanho());

        lista.adiciona(a2);
        System.out.println("Tamanho da lista de alunos: " + lista.tamanho());

        lista.adiciona(a3);
        System.out.println("Tamanho da lista de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        try {
            System.out.println(lista.pega(102));
        } catch (IllegalArgumentException e){
            System.out.println("Aluno da posição não existe");
            System.out.println(e.getMessage());
        }

        lista.adiciona(1, a4);
        System.out.println(lista);
    }
}
