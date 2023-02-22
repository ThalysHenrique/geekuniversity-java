package br.com.geekuniversity.secao15;

// Métodos estáticos
public class Programa32 {
    public static void main(String[] args) {

        Conta c1 = new Conta("Jax");
        System.out.println("Nome: " + c1.getCliente());
        System.out.println("Número da conta: " + c1.getNum());
        System.out.println("Próxima conta: " + Conta.proximaConta());
    }
}
