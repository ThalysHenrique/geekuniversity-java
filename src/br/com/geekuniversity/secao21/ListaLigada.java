package br.com.geekuniversity.secao21;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    /**
     * Método que adiciona no começo da lista.
     * @param elemento
     */
    public void adicionaComeco(Object elemento){
        if(this.total == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total += 1;


//        // TODO (para fazer)
//        Celula nova = new Celula(elemento, this.primeira);
//        this.primeira = nova;
//
//        if(this.total == 0){
//            this.ultima = this.primeira;
//        }
//        this.total += 1;
    }

    /**
     * Método que adiciona um objeto no final da lista.
     * @param elemento
     */
    public void adiciona(Object elemento){
        // TODO
        if(total == 0){
            this.adicionaComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima); // <-- Obj -->
            this.ultima = nova;
            this.total += 1;
        }
    }

    /**
     * Método que adiciona um elemento no meio da lista de acordo com a posição.
     * Primeiro o programa verifica se o total de posições é 0, Se for ele adiciona no Começo, caso contrário ele verifica se o número de posições
     * é igual o total, Se for ele adiciona no final, caso contrário ele adiciona no Meio da lista.
     * @param posicao
     * @param elemento
     */
    public void adiciona(int posicao, Object elemento){
        // TODO
        if(total == 0){
            this.adicionaComeco(elemento);
        } else if(posicao == this.total){
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            nova.setAnterior(proxima);
            proxima.setAnterior(nova);
            this.total += 1;
        }
    }

    public Object pega(int posicao){
       return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao){
        // Se só tiver um elemento
        if(this.total == 0){
            this.removeComeco();
            // Se for o último elemento
        } else if(posicao == this.total - 1){
            this.removeFim();
            // Se for um elemento do meio
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();

            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.total -= 1;
        }
    }

    public void removeFim(){
        if(this.total == 1){
            this.removeComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.total -= 1;
        }
    }

    public void removeComeco(){
        if(this.total == 0){
            throw new IllegalArgumentException("Lista vazia!");
        }
        this.primeira = this.primeira.getProximo();
        this.total -= 1;

        if(total == 0){
            this.ultima = null;
        }
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(Object obj){
        Celula atual = this.primeira;

        while(atual != null){
            if(atual.getElemento().equals(obj)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    /**
     * Método que verifica se a posição está ocupada
     * @param posicao
     * @return
     */
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.total;
    }

    /**
     * Método que pega a posiçao do elemento
     * @param posicao
     * @return
     */
    public Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        } else {
            Celula atual = this.primeira;

            for(int i = 0; i < posicao; i++){
                atual = atual.getProximo();
            }
            return atual;
        }
    }

    @Override
    public String toString() {
        if(total == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < total; i++){
            builder.append(atual.getElemento());
            builder.append(" - ");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
}
