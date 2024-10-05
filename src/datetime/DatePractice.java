package datetime;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println("SQL Date: " + sqlDate);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted date " + format.format(date));

        System.out.println("Formatted date using the calender " + format.format(Calendar.getInstance().getTime()));

        System.out.println("Java 8 localdate");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.of(1996,07,22);
        System.out.println(localDate);

        localDate = LocalDate.parse("2000-09-10");
        System.out.println(localDate);

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

//        LocalDateTime ustime = LocalDateTime.now(ZoneId.of("Etc/GMT-4"));
        LocalDateTime ustime = LocalDateTime.now(ZoneId.systemDefault());

        System.out.println(ustime);

        // change date  to localdate
        LocalDate localDate1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Local date 1 ::: " +localDate1);

        LocalDateTime localDateTime1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Local dateTime  1 ::: " +localDateTime1);

        Date date2 = Date.from(ustime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Date 2 is " + date2);


        LocalTime localTime = LocalTime.MAX;
        System.out.println(localTime);


    }
}
