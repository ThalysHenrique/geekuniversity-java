package br.com.geekuniversity.secao18;


import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;
import com.sun.security.jgss.GSSUtil;

// Object: A mãe de todas as classes
// A classe Object faz parte do pacote java.lang
public class Programa36 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bart", 22, "Casa Azul");
        Cliente cliente2 = new Cliente("Homer", 17, "Casa Amarela");

        Conta c1 = new Conta(1, 250, 250, cliente1);
        Conta c2 = new Conta(2, 300, 300, cliente2);
        Conta c3 = new Conta(3, 350, 350, new Cliente("Lisa", 12, "Casa Rosa"));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        if(c1.equals(c2)){
            System.out.println("São contas iguais");
        } else if (c2.equals(c3)){
            System.out.println("São contas iguais");
        } else {
            System.out.println("São contas diferentes");
        }

        Caixa documentos = new Caixa();

        documentos.adicionarConta(c1);
        documentos.adicionarConta(c2);

        documentos.pegarPosicao(0);
        documentos.pegarPosicao(1);

        System.out.println(documentos.pegarPosicao(0));

        documentos.adicionarConta(cliente1);

        System.out.println(documentos.pegarPosicao(1));
        System.out.println(((Cliente)documentos.pegarPosicao(2)).getNome()); // Casting

        if((Object)cliente1 instanceof Conta){ // Casting
            System.out.println("Objeto é do tipo conta");
        } else {
            System.out.println("Objeto não é do tipo Conta");
        }
    }
}
