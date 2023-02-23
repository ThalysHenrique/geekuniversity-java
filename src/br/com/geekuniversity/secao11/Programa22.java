package br.com.geekuniversity.secao11;

public class Programa22 {
    public static void main(String[] args) {

        Cliente jax = new Cliente("Thalys", 20, "California");
        Cliente teller = new Cliente("Thalys", 17, "Charming Town");

        Conta contaJax = new Conta(1, 170, 1000, jax);
        Conta contaTeller = new Conta(2, 540, 2000, teller);

        System.out.println("Saldo do Jax: " + contaJax.getSaldo());
        System.out.println("Saldo do Teller: " + contaTeller.getSaldo());

        contaJax.sacar(4000);
        contaTeller.sacar(35);

        System.out.println("Saldo do Jax: " + contaJax.getSaldo());
        System.out.println("Saldo do Teller: " + contaTeller.getSaldo());

        contaJax.depositar(240);
        contaTeller.depositar(335);

        System.out.println("Saldo do Jax: " + contaJax.getSaldo());
        System.out.println("Saldo do Teller: " + contaTeller.getSaldo());
    }
}
