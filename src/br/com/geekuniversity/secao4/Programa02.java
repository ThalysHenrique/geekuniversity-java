package br.com.geekuniversity.secao4;

// Operador Ternário
public class Programa02 {
    public static void main(String[] args) {

        int valor = -1;
        int num;

//        if(valor > 0){
//            num = valor;
//        } else {
//            num = 7;
//        }

        // Operador Ternário -> Apenas if + else
        num = (valor > 0) ? valor : 7;

        System.out.println(num);

    }
}
