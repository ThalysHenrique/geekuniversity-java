package br.com.geekuniversity.secao12;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, String email, int anoNascimento, String matricula) {
        super(nome, email, anoNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void novaMensagem(String txt) {
        System.out.println(txt);
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
