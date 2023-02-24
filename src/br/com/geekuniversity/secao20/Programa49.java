package br.com.geekuniversity.secao20;

// Simulação da geração de relatório + barra de tarefa
// Sem utilização de threads
public class Programa49 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        barra.executa();

        GeraRelatorio gera = new GeraRelatorio();
        gera.executa();
    }
}
