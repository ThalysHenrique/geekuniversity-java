package br.com.geekuniversity.secao21;

// Pilhas --> Estrutura de dados onde o elemento que está visível/disponível está sempre no TOPO

// Os elementos são sempre adicionados no TOPO, só podemos remover o TOPO
public class Programa58 {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println(pilha.vazia());
        System.out.println(pilha);

        pilha.insere("Carl");
        pilha.insere("Johnson");
        System.out.println(pilha);

        pilha.insere("Sweet");
        System.out.println(pilha);


        String remove = pilha.remove();
        System.out.println(remove);
        System.out.println(pilha);

        System.out.println(pilha.vazia());
        System.out.println(pilha.pegaTopo());
    }
}
