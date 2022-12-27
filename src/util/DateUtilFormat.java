package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtilFormat {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formatDate(LocalDate date) {
        return dtf.format(date);
    }

    public static LocalDate formatDate(String date) {
       return LocalDate.parse(date, dtf);
    }
}

