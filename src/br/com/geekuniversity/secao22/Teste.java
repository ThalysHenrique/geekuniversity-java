package br.com.geekuniversity.secao22;

/**
 * Interfaces podem ter:
 * Constantes
 * Métodos abstratos
 * Default Methods
 */
public interface Teste {

    int valor = 9;
    public String mensagem();
    default void meuMetodo(){
        System.out.println("Meu default method");
    }
}
