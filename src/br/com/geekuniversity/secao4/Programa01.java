package br.com.geekuniversity.secao4;

// if, else, else if
public class Programa01 {
    public static void main(String[] args) {

        int num = 2;

        if(num>5){
            System.out.println("maior que 5");
        } else if (num % 2 == 0){
            System.out.println("é par");
        }else if(num == 5){
            System.out.println("igual a 5");
        } else {
            System.out.println("menor que 5");
        }
    }
}