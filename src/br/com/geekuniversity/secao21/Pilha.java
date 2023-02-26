package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<String>();
    public void insere(String nome){
        this.nomes.add(nome);
    }

    /**
     * Em uma pilha sempre remove quem está no topo
     * @return
     */
    public String remove(){
        return this.nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo() {
        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia(){
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
