package br.com.geekuniversity.secao12;

// Benefícios da herança:
//- Evita repetiçao de código
//- Facilita a manutençao do código
//- Ganha os atributos da classe herdada
public class Aluno extends Pessoa {
    private String RA;
    public Aluno(String nome, String email, int anoNascimento, String RA) {
        super(nome, email, anoNascimento);
        this.RA = RA;
    }
    public String getRA() {
        return RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }

    @Override
    public void novaMensagem(String txt) {
        System.out.println(txt);
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                "RA='" + RA + '\'' +
                '}';
    }
}
