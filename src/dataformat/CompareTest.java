package dataformat;

import java.time.LocalDateTime;

public class CompareTest {

    public static void main(String[] args) {

        LocalDateTime plusDays = LocalDateTime.now().plusDays(1); // 2023-09-12
        LocalDateTime now = LocalDateTime.now();				  // 2023-09-11
        LocalDateTime now2 = LocalDateTime.now();				  // 2023-09-11

        System.out.println(now.isAfter(plusDays)); // false -> now(2023-09-11) > plusDays(2023-09-12) 와 같음
        System.out.println(now.isAfter(now2));	   // false (주어진 날짜(now)와 파라미터의 값(now2)가 같은경우 false)

        System.out.println(now.isBefore(plusDays));  // true -> now(2023-09-11) < plusDays(2023-09-12) 와 같음
        System.out.println(now.isBefore(now2));      // false (주어진 날짜(now)와 파라미터의 값(now2)가 같은경우 false)

        System.out.println(plusDays.isAfter(now));  // true -> plusDays(2023-09-12) > now(2023-09-11) 와 같음
        System.out.println(plusDays.isBefore(now)); // false -> plusDays(2023-09-12) < now(2023-09-11) 와 같음

        System.out.println(now.compareTo(plusDays));
        System.out.println(now.compareTo(now2));
        System.out.println(plusDays.compareTo(now));

    }
}
