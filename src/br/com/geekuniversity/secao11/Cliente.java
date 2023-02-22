package br.com.geekuniversity.secao11;

// Encapsulamento
// Protected -> Elemento fica visível somente dentro do mesmo pacote onde foi declarado
public class Cliente {

    private String nome;
    private String endereco;
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void mensagem(){
        System.out.println(this.nome + " Está dizendo: Olá!");
    }
}
