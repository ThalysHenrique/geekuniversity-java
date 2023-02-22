package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico {
    private boolean ligado = false;

    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Ventilador ligado");
        }
    }
    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Ventilador desligado");
        }
    }
}
