package br.com.geekuniversity.secao9;

import br.com.geekuniversity.secao9.Pessoa;

// Construtor
//- Construtor de uma classe SEMPRE tem o mesmo nome da classe
//- Podemos ter mais de um construtor na classe
//- Por padrao a JVM cria em tempo de execuçao um construtor padrao (construtor vazio)
public class Programa20 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(); // (Método) Construtor

        pessoa.nome = "Jax Teller";
        pessoa.email = "jaxteller@sonsofanarchy.com";
        pessoa.anoNascimento = 2008;

        pessoa.imprimeInformacoes();

        Pessoa pessoa2 = new Pessoa("JaxTeller", "jaxteller@sonsofanarchy.com", 2008);

        pessoa2.imprimeInformacoes();
    }
}
