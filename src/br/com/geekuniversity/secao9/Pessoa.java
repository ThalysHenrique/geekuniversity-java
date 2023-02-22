package br.com.geekuniversity.secao9;

// Classes
// Atributos
// Métodos

// Construtor vazio tem a seguinte forma:
// public NomeDaClasse (){}
public class Pessoa {
    String nome;
    String email;
    int anoNascimento;

    // Construtor vazio
    public Pessoa() {

    }

    // Construtor com parametros
    public Pessoa(String nome, String email, int anoNascimento){
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de nascimento: " + this.anoNascimento);
    }
}
