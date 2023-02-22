package br.com.geekuniversity.secao12;

// Classe base / mãe / pai / superClasse / genérica
// Classe abstrata -> impedimos a criaçao de objetos dessa classe
// Classe absctract pode ter:
//- Atributos
//- Métodos
//- Métodos abstratos -> nao possuem implementaçao, apenas declaraçao, obrigatoriamente, as classes que herdarem desta classe com método abstract precisam implementar estes métodos
public abstract class Pessoa {
    private String nome;
    private String email;
    private int anoNascimento;

    // Overloading -> Sobrecarga de método
    public Pessoa() {}
    public Pessoa(String nome, String email, int anoNascimento) {
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    // Overloading -> Sobrecarga de método
    public void mensagem(){
        System.out.println("Minha mensagem...");
    }
    public void mensagem(String msg){
        System.out.println(msg);
    }
    public void mensagem(String msg, int num){
        System.out.println(msg + num);
    }
    // Declaração de método abstrato
    public abstract void novaMensagem(String txt); // -> Nao abre chaves {}, apenas finaliza ;

    // Sobrescrita de método -> Override -> Herdando da classe object
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }
}
