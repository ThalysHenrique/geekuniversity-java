package br.com.geekuniversity.secao13;

public class TreinamentoFimDaTemporada extends Treinamento {

    @Override
    public void preparoFisico() {
        System.out.println("Preparo Físico de Fim de Temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino de Fim de Temporada");
    }
}
