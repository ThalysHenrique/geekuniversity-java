package br.com.geekuniversity.secao13;

// Template Method
public class Programa29 {
    public static void main(String[] args) {

        TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();

        tit.treinoDiario();

        TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();

        tft.treinoDiario();
    }
}
