package br.com.geekuniversity.secao21;

// Celula (Container) objeto valor e uma celula que será ligação para o próximo
public class Celula {
    // object, pois posso colocar uma string/int/float etc
    private Object elemento;
    // celula faz a ligação
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento, Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento){
        this(elemento, null);
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

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}
