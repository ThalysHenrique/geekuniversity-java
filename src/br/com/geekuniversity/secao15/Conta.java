package br.com.geekuniversity.secao15;

public class Conta {
    private int num;
    private String cliente;
    public static int contador = 1;

    public Conta(String cliente) {
        this.num = contador;
        this.cliente = cliente;
        Conta.contador += 1; // -> Atributo estático acessa pela classe = Conta.contador
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public static int proximaConta(){
        return Conta.contador;
    }
}
