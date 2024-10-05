package datetime;

import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current + 2 Days : " + localDate.plusDays(2));
        System.out.println("Current + 2 Days : " + localDate.plusMonths(2));

        System.out.println("");

        long between = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusMonths(2));
        System.out.println(between);

        between = ChronoUnit.DAYS.between(LocalDate.now() , LocalDate.now().plusYears(2).plusMonths(2));

        System.out.println(between);
        System.out.println(LocalDate.now().withYear(1992).withMonth(7));

    }
}
