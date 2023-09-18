package dataformat;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CustomFormatTest {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println("format = " + format);

        String[] pattern = {"G",     // 서기
                "y",     // 2017
                "M",     // 6
                "q",     // 2
                "w",     // 24
                "W",     // 3
                "D",     // 163
                "d",     // 12
                "F",     // 5
                "e",     // 2
                "a",     // 오후
                "H",     // 15
                "h",     // 3
                "k",     // 15
                "K",     // 3
                "m",     // 53
                "s",     // 4
                "S",     // 5
                "A",     // 57184516
                "n",     // 516000000
                "N",     // 57185416000000
                "z",     // KST
                "O",     // GMT+9
                "Z",     // +0900
                "x" };   // +09

        ZonedDateTime zdt = ZonedDateTime.now();

        for(int i =0; i<pattern.length; i++){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern[i]);
            System.out.println(zdt.format(dtf));
        }


        ZonedDateTime zdateTime = ZonedDateTime.now();

        String[] patternArr = {
                "yyyy-MM-dd HH:mm:ss",
                "''yy년 MMM dd일 E요일",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "오늘은 올 해의 D번째 날입니다.",
                "오늘은 이 달의 d번째 날입니다.",
                "오늘은 올 해의 w번째 주입니다.",
                "오늘은 이 달의 W번째 주입니다.",
                "오늘은 이 달의 W번째 E요일입니다."
        };


        for(String p : patternArr) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zdateTime.format(formatter));
        }
    }
}
