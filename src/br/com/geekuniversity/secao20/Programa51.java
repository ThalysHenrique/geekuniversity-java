package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Por padrão as threads não são sincronizadas
// Pode ocorrer problemas de uma thread não acessar o valor de um objeto que ainda não foi atualizado ou as threads executarem depois do valor já estar impresso
// Thread não sincronizada
public class Programa51 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Thalys", 22, "EUA");
        Conta co1 = new Conta(1, 100, 200, c1);
        FazDeposito deposit = new FazDeposito(co1);
        Thread t1 = new Thread(deposit);
        Thread t2 = new Thread(deposit);

        t1.start();
        t2.start();

        System.out.println(co1);
    }
}
