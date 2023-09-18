package dataformat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        print("now", now);
        print("firstDayOfNextMonth(다음 달의 첫 날)", now.with(TemporalAdjusters.firstDayOfNextMonth())); // 다음 달의 첫 날
        print("firstDayOfMonth(이 달의 첫 날)", now.with(TemporalAdjusters.firstDayOfMonth())); // 이 달의 첫 날
        print("lastDayOfMonth(이 달의 마지막 날)", now.with(TemporalAdjusters.lastDayOfMonth())); // 이 달의 마지막 날
        print("firstInMonth(이 달의 첫번째 월요일)", now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))); // 이 달의 첫번째 월요일
        print("lastInMonth(이 달의 마지막 금요일)", now.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY))); // 이 달의 마지막 금요일
        print("previous(지난 주 월요일(오늘 미포함))", now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY))); // 지난 주 화요일(오늘 미포함)
        print("previousOrSame(지난 주 월요일(오늘 포함))", now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))); // 지난 주 화요일(오늘 포함)
        print("next(다음 주 월요일(오늘 미포함))", now.with(TemporalAdjusters.next(DayOfWeek.MONDAY))); // 다음 주 화요일(오늘 미포함)
        print("nextOrSame(다음 주 월요일(오늘 포함))", now.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY))); // 다음 주 화요일(오늘 포함)
        print("dayOfWeekInMonth(이 달의 4번째 화요일)", now.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY))); // 이 달의 4번째 화요일
    }

    public static void print(String str, Object obj) {
        System.out.println(str + " : " + obj);
    }
}
