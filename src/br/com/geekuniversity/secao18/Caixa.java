package br.com.geekuniversity.secao18;

// Caixa de objetos genéricos
public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;
    public Caixa(){
        objetos = new Object[100];
        posicaoLivre = 0;
    }
    public void adicionarConta(Object nova){
        this.objetos[this.posicaoLivre] = nova;
        posicaoLivre++;
    }
    public Object pegarPosicao(int posicao){
        return this.objetos[posicao];
    }
}
