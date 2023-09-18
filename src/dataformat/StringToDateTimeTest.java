package dataformat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime parse = LocalDateTime.parse("2023-09-07 23:12:04", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime parse2 = LocalDateTime.parse("2023/09/07 23:12:04", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        LocalDateTime parse3 = LocalDateTime.parse("2023-09-07T23:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println("parse = " + parse);
        System.out.println("parse2 = " + parse2);
        System.out.println("parse3 = " + parse3);
    }
}
