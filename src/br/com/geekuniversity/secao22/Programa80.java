package br.com.geekuniversity.secao22;

import java.time.*;
import java.time.format.DateTimeFormatter;

// Datas
public class Programa80 {
    public static void main(String[] args) {

        // Formato ISO -> International
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // Formato ISO -> International
        LocalDate anoNovo = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println(anoNovo);

        int ano = anoNovo.getYear();
        Month mes = anoNovo.getMonth();
        int dia = anoNovo.getDayOfMonth();

        System.out.println(dia + "/" + mes + "/" + ano);

        Period periodo = Period.between(hoje, anoNovo);
        System.out.println(periodo);

        System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o ano novo.");

        // Formatador de Data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); // Formato ISO (International)

        // Formatador de Horas -> hh (formato de 12 horas -> am : pm) | HH (formato 24 horas)
        DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatadorHoras));

        LocalTime intervalo = LocalTime.of(9, 15);
        System.out.println("Horário do intervalo: " + intervalo);
    }
}
