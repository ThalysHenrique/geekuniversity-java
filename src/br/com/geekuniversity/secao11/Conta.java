package br.com.geekuniversity.secao11;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    // Construtor
    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    /**
     * Método getter do atributo saldo
     * @return a soma do saldo + limite bancário
     */
    public float getSaldo() {
        return saldo + limite;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método para sacar um valor da conta bancária,
     * Antes de ser sacado o valor, o método verifica se há saldo disponível
     * @param valor a ser sacado
     */
    public void sacar(float valor){
        if(valor <= saldo){
            this.saldo -= valor;
        } else if(valor <= (this.limite + this.saldo)) {
            this.saldo = (this.saldo + this.limite) - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
    }
}
