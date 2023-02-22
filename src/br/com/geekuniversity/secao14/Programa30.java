package br.com.geekuniversity.secao14;

// Interfaces
public class Programa30 {
    public static void main(String[] args) {
        Ventilador vento = new Ventilador();

        System.out.println("Marca do ventilador: " + vento.MARCA);

        vento.desligar();
        vento.ligar();
        vento.desligar();
    }
}
