package br.com.geekuniversity.secao19;

import br.com.geekuniversity.secao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa44 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c1 = new Cliente("Thalys", 16, "Brazil");
        Cliente c2 = new Cliente("Henrique", 26, "United States");
        Cliente c3 = new Cliente("Ana", 22, "France");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        // Precisa implementar o Comparable na classe Cliente
        Collections.sort(clientes);

        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }

    }
}
