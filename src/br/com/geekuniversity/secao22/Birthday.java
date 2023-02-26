package br.com.geekuniversity.secao22;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Birthday {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(2023, Month.JUNE, 7);

        int year = birthday.getYear();
        Month month = birthday.getMonth();
        int day = birthday.getDayOfMonth();

        Period period = Period.between(today, birthday);
        JOptionPane.showMessageDialog(null, "Faltam " + period.getYears() + " anos " + period.getMonths() + " meses e " + period.getDays() + " dias para o seu aniversário.");
    }
}
