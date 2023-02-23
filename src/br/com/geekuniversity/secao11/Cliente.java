package br.com.geekuniversity.secao11;

// Encapsulamento
// Protected -> Elemento fica visível somente dentro do mesmo pacote onde foi declarado
public class Cliente implements Comparable {

    private String nome;
    private int idade;
    private String endereco;

    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void mensagem() {
        System.out.println(this.nome + " Está dizendo: Olá!");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
    @Override
    public int compareTo(Object outro) {
        Cliente auxiliar = (Cliente)outro;
        if (this.idade < auxiliar.idade) {
            return -1;
        } else if (this.idade > auxiliar.idade){
            return 1;
        } else {
            return 0;
        }
    }
}
