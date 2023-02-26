package br.com.geekuniversity.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
    private ArrayList<LinkedList<String>> nomes = new ArrayList<LinkedList<String>>();

    public Conjunto(){
        for(int i = 0; i < 26; i++){
            nomes.add(new LinkedList<String>());
        }
    }

    public int calculaIndice(String nome){
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome){
        // Verifica se o nome contem na lista
        if(!contem(nome)){
            // Calcula o índice do nome
            int indice = calculaIndice(nome);
            // Pega a lista de acordo com o índice (nome)
            List<String> lista = nomes.get(indice);
            // Adiciona o nome ao índice da lista
            lista.add(nome);
        }
    }

    public void remove(String nome){
        // Verifica se contem o nome
        if(contem(nome)){
            // Calcula o indice especifico da lista
            int indice = calculaIndice(nome);
            // Busca a lista especifica do nome
            List<String> lista = nomes.get(indice);
            // Remove o nome da lista
            lista.remove(nome);
        }
    }

    private boolean contem(String nome){
        // Calcula o índice do nome
        int indice = calculaIndice(nome);
        // Busca na lista o índice especifico do nome
        return nomes.get(indice).contains(nome);
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
