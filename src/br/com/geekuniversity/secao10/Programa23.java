package br.com.geekuniversity.secao10;

import br.com.geekuniversity.secao11.Cliente;

public class Programa23 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("John", 18, "Estados Unidos");

//        System.out.println("Nome: " + c1.nome); -> private
//        System.out.println("Endereço: " + c1.endereco); -> private

//        c1.mensagem(); -> protected
    }
}
