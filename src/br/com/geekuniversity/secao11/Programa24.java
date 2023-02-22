package br.com.geekuniversity.secao11;

// Private -> privado à própria classe
// -> só tem acesso ao atributo/método criado dentro da própria classe onde foi declarado
public class Programa24 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("John", "California");
        Cliente c2 = new Cliente("Jax", "California");

        c1.mensagem();
        System.out.println("Nome: " + c1.getNome() + " Endereço: " + c1.getEndereco());

        c2.mensagem();
        System.out.println("Nome: " + c2.getNome() + " Endereço: " + c2.getEndereco());

    }
}
