package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        // TODO receber um aluno
        // Se aluno for null, adiciona um aluno e para a execução do programa
//        for(int i = 0; i < alunos.length; i++){
//            if(alunos[i] == null){
//                alunos[i] = aluno;
//                break;
//            }
//        }
        this.garantirEspaco();
        this.alunos[total] = aluno;
        total += 1;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = total - 1; i >= posicao; i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++;
    }

    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException(("Posição inválida"));
        }
        return this.alunos[posicao];
    }
    public void remove(int posicao){
        // TODO remove aluno pega posição

        for(int i = posicao; i < this.total; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        total--;
    }
    public boolean contem(Aluno aluno){
        // TODO descobre se aluno está ou não na lista
        for(int i = 0; i < total; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos); // Facilita a visualização do Array
    }

    public boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < total;
    }

    private void garantirEspaco(){
        // Verifica se o array de aluno está cheio
        if(total == alunos.length){
            // Caso esteja cheio, cria um novo array com o dobro de tamanho
            Aluno novoArray[] = new Aluno[alunos.length * 2];
            // Copia os dados do array anterior para o novo array
            for(int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }
}
