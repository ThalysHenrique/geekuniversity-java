package br.com.geekuniversity.secao20;

public class GeraRelatorio implements Runnable{
    public void executa(){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1) + "% Gerando relatório... aguarde");
        }
    }
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println((i+1) + "% Gerando relatório... aguarde");
        }
    }
}
