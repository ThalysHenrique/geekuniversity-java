package exercicios.secao8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Crie uma funçao que receba a data atual (dia/mes/ano em inteiro) e imprima na tela em formato por extenso
public class ExercicioData {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
        Date today = Calendar.getInstance(Locale.getDefault()).getTime();
        System.out.println(dateFormat.format(today));

    }
}
