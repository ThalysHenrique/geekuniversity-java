package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Thread sincronizada
// O sincronismo ocorre, pois durante a execução do método o thread executa um 'lock' (bloqueio) da função para que a outra
// thread só possa executa-la pós finalização da thread inicial
public class Programa52 {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = new Cliente("Thalys", 22, "EUA");
        Conta co1 = new Conta(1, 100, 200, c1);
        FazDeposito deposit = new FazDeposito(co1);
        Thread t1 = new Thread(deposit);
        Thread t2 = new Thread(deposit);

        t1.start();
        t2.start();

        t1.join(); // avisando que thread t1 deve 'se juntar' a um sincronizador
        t1.join(); // avisando que thread t2 deve 'se juntar' a um sincronizador

        System.out.println(co1);
    }
}
