package br.com.geekuniversity.secao20;

public class BarraDeProgresso implements Runnable{
    public void executa(){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1) + "% Barra de progresso... aguarde");
        }
    }
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println((i+1) + "% Barra de progresso... aguarde");
        }
    }
}
