package br.com.geekuniversity.secao20;

// Simulação da geração de relatório + barra de tarefa
// Com utilização de threads
public class Programa50 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);

        GeraRelatorio gera = new GeraRelatorio();
        Thread t2 = new Thread(gera);

        t1.start();
        t2.start();
    }
}
