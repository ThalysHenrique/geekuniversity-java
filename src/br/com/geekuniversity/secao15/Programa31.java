package br.com.geekuniversity.secao15;

// Atributos estáticos
public class Programa31 {
    public static void main(String[] args) {

        Conta c1 = new Conta("CJ");

        System.out.println(c1.getNum());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Ryder");

        System.out.println(c2.getNum());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Sweet");

        System.out.println(c3.getNum());
        System.out.println(c3.getCliente());

        Conta c4 = new Conta("Big Smoke");

        System.out.println(c4.getNum());
        System.out.println(c4.getCliente());

    }
}
