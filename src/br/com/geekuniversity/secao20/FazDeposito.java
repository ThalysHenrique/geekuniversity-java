package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class FazDeposito implements Runnable{
    Conta conta;

    public FazDeposito(Conta conta){
        this.conta = conta;
    }
    @Override
    public void run() {
        this.conta.depositar(100);
    }
}
