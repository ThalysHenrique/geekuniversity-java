package br.com.geekuniversity.secao21;

// Celula (Container) objeto valor e uma celula que será ligação para o próximo
public class Celula {
    // object, pois posso colocar uma string/int/float etc
    private Object elemento;
    // celula faz a ligação
    private Celula proximo;

    public Celula(Object elemento, Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
