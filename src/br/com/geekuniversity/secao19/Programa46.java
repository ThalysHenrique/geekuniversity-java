package br.com.geekuniversity.secao19;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.HashMap;
import java.util.Map;

// HashMap -> implementa a interface Map e trabalha com o conceito de chave/valor
//- Não aceita chaves duplicadas, mas valores sim
public class Programa46 {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente c1 = new Cliente("Simon", 10, "California");
        Cliente c2 = new Cliente("Alvin", 10, "California");
        Cliente c3= new Cliente("Teodoro", 10, "California");

        Conta co1 = new Conta(1, 200, 400, c1);
        Conta co2 = new Conta(2, 200, 400, c2);
        Conta co3 = new Conta(3, 200, 400, c3);

        contas.put("Pessoa Física", co1);
        contas.put("Pessoa Jurídica", co2);
        contas.put("Pessoa Fisica", co3);

        System.out.println(contas.size());
        System.out.println(contas.get("Pessoa Física"));
    }
}
