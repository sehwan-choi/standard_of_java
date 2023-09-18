package dataformat;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Format1 {

    public static void main(String[] args) {
        System.out.printf("%d", 1000);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        now.format(dateTimeFormatter);
        System.out.println("now = " + now);

        LocalDate localDate = LocalDate.ofYearDay(1999, 300);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String displayName = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.getDefault());
        System.out.println("displayName = " + displayName);

        System.out.println("dayOfWeek = " + dayOfWeek);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        LocalDateTime test1 = LocalDateTime.of(LocalDate.of(2023, 9, 7), LocalTime.MIN);
        int dayOfYear1 = test1.getDayOfYear();
        System.out.println("test1 dayOfYear1 = " + dayOfYear1);
        Month month = test1.getMonth();
        System.out.println("test1 dayOfMonth = " + month);
        DayOfWeek dayOfWeek1 = test1.getDayOfWeek();
        System.out.println("test1 dayOfWeek1 = " + dayOfWeek1);

        LocalDateTime localDateTime = test1.withYear(2024);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime plus1 = LocalDateTime.now().plusDays(1);
        LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now1.isAfter(plus1));

        System.out.println(plus1.isAfter(now1));

        Instant now2 = Instant.now();
        System.out.println("now2 = " + now2);
        System.out.println(now2.toEpochMilli());

        long epochMilli = now2.toEpochMilli();
        Instant instant = Instant.ofEpochMilli(epochMilli);
        System.out.println("instant = " + instant);

//        LocalDateTime from = LocalDateTime.from(instant);
//        System.out.println("from = " + from);

        LocalDate date = LocalDate.of(2023, 9, 7);
        LocalTime time = LocalTime.of(12, 34, 56);

        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println("atTime = " + localDateTime1);

        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println("atDate = " + localDateTime2);


    }
}
