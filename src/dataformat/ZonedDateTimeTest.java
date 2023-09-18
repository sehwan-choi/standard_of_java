package dataformat;

import java.time.*;

public class ZonedDateTimeTest {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        //LocalDateTime, ZonedDateTime간의 변환
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulZonedDateTime = ZonedDateTime.now(seoulZoneId);

        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        ZonedDateTime newYorkZonedDateTime = ZonedDateTime.now(newYorkZoneId);

        System.out.println("seoulZonedDateTime = " + seoulZonedDateTime);
        System.out.println("newYorkZonedDateTime = " + newYorkZonedDateTime);


        LocalDateTime seoulLocalDateTime = seoulZonedDateTime.toLocalDateTime();
        LocalDateTime newYorkLocalDateTime = newYorkZonedDateTime.toLocalDateTime();

        System.out.println("seoulLocalDateTime = " + seoulLocalDateTime);
        System.out.println("newYorkLocalDateTime = " + newYorkLocalDateTime);

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        //LocalDateTime -> ZonedDateTime 변환
        //한국 시간 2023-09-07 09:15을 미국 뉴욕시간으로 변환
        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.of(2023,9,7), LocalTime.of(9,15));
        ZonedDateTime seoulZonedDateTime2 = localDateTime1.atZone(seoulZoneId); //  현재 ZoneId를 설정(seoul)
        ZonedDateTime newYorkZonedDateTime2 = seoulZonedDateTime2.withZoneSameInstant(newYorkZoneId); // 뉴옥 ZoneId로 변경
        System.out.println("seoulZonedDateTime2 = " + seoulZonedDateTime2);
        System.out.println("newYorkZonedDateTime2 = " + newYorkZonedDateTime2);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now().withZoneSameInstant(newYorkZoneId);
        System.out.println("zonedDateTime1 = " + zonedDateTime1);


        //주의
        LocalDateTime localDateTime3 = LocalDateTime.of(LocalDate.of(2023,9,7), LocalTime.of(9,15));
        ZonedDateTime seoulZonedDateTime3 = localDateTime3.atZone(newYorkZoneId); //  ZoneId만 "America/New_York"으로 설정한경우
        System.out.println("localDateTime3 = " + localDateTime3);
        System.out.println("seoulZonedDateTime3 = " + seoulZonedDateTime3);
    }
}
