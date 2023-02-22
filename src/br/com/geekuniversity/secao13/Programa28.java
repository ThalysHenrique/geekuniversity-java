package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;

// Classes abstratas -> recurso que proporciona um bloqueio na criação de objetos, nao pode ser instanciado objeto da classe abstract
public class Programa28 {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("Tara", "tara@hotmail.com", 2008);
//        System.out.println(p1);

        Aluno a1 = new Aluno("Tara", "tara@hotmail.com", 2008, "70");

        System.out.println(a1);
        a1.mensagem();
        a1.mensagem("Hello!");
        a1.mensagem("Oi, ", 7);
        a1.novaMensagem("Olá!");
    }
}
