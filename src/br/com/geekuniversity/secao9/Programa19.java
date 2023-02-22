package br.com.geekuniversity.secao9;


import br.com.geekuniversity.secao9.Pessoa;
import br.com.geekuniversity.secao9.Produto;

// Objetos
public class Programa19 {
    public static void main(String[] args) {

        // Declaraçao de objeto
        Produto p0;

        // Declaraçao e inicializaçao/instanciaçao do objeto
        // p1 -> instancia do objeto / objeto
        Produto p1 = new Produto(); // Construtor
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("======= Produtos =======");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%");

        p0 = new Produto();

        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println("======= Produtos =======");
        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "%");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Jax Teller";
        pessoa1.email = "jaxteller@sonsofanarchy.com";
        pessoa1.anoNascimento = 2008;

        System.out.println("======= Pessoas =======");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("E-mail: " + pessoa1.email);
        System.out.println("Ano de nascimento: " + pessoa1.anoNascimento);
    }
}
