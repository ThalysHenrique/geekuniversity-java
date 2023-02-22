package br.com.geekuniversity.secao13;

public class TreinamentoInicioDaTemporada extends Treinamento {

    @Override
    public void preparoFisico() {
        System.out.println("Preparo Físico de Inicio da Temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino de Inicio da Temporada");
    }
}
