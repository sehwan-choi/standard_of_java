package dataformat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTest {

    public static void main(String[] args) {

        /**
         ISO_DATE_TIME	Date and time with Zoneld	2023-09-11T10:15:30+09:00[Asia/Seoul]
         ISO_LOCAL_DATE	ISO Local Date	2023-09-11
         ISO_LOCAL_TIME	time without offset	10:15:30
         ISO_LOCAL_DATE_TIME	ISO Local Date and Time	2023-09-11T10:15:30
         ISO_OFFSET_DATE	ISO Date with Offset	2023-09-11+09:00
         ISO_OFFSET_TIME	Time with offset	10:15:30+09:00
         ISO_OFFSET_DATE_TIME	Date Time with Offset	2023-09-11T10:15:30+09:00
         ISO_ZONED_DATE_TIME	Zoned Date Time	2023-09-11T10:15:30+09:00[Asia/Seoul]
         ISO_INSTANT	Date and Time of an Instant	2023-09-11T10:15:30Z
         BASIC_ISO_DATE	Basic ISO date	20230911
         ISO_DATE	ISO Date with or without offset	2023-09-11+09:00
         2023-09-11
         ISO_TIME	Time with of without offset	10:15:30+09:00
         10:15:30
         ISO_ORDINAL_DATE	Year and day of year	2023-337
         ISO_WEEK_DATE	Year and Week	2012-W48-6
         RFC_1123_DATE_TIME	RFC 1123 / RFC 822	Tue, 3 Jun 2023 10:15:30 GMT
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        LocalDate localDate = LocalDate.now();
        print("ISO_DATE_TIME" , DateTimeFormatter.ISO_DATE_TIME.format(localDateTime));
        print("ISO_LOCAL_DATE" , DateTimeFormatter.ISO_LOCAL_DATE.format(localDateTime));
        print("ISO_LOCAL_TIME" , DateTimeFormatter.ISO_LOCAL_TIME.format(localDateTime));
        print("ISO_LOCAL_DATE_TIME" , DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime));
        print("ISO_OFFSET_DATE" , DateTimeFormatter.ISO_OFFSET_DATE.format(zonedDateTime));
        print("ISO_OFFSET_TIME" , DateTimeFormatter.ISO_OFFSET_TIME.format(zonedDateTime));
        print("ISO_OFFSET_DATE_TIME" , DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime));
        print("ISO_ZONED_DATE_TIME" , DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));
        print("ISO_INSTANT" , DateTimeFormatter.ISO_INSTANT.format(zonedDateTime));
        print("BASIC_ISO_DATE" , DateTimeFormatter.BASIC_ISO_DATE.format(localDateTime));
        print("ISO_DATE" , DateTimeFormatter.ISO_DATE.format(localDateTime));
        print("ISO_TIME" , DateTimeFormatter.ISO_TIME.format(localDateTime));
        print("ISO_ORDINAL_DATE" , DateTimeFormatter.ISO_ORDINAL_DATE.format(localDateTime));
        print("ISO_WEEK_DATE" , DateTimeFormatter.ISO_WEEK_DATE.format(localDateTime));
        print("RFC_1123_DATE_TIME" , DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));
    }


    public static void print(String str, Object obj) {
        System.out.println(str + " : " + obj);
    }
}
