package test.stream_test2;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamTest16 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("intSummaryStatistics.getSum() = " + intSummaryStatistics.getSum());
        System.out.println("intSummaryStatistics.getMax() = " + intSummaryStatistics.getMax());
        System.out.println("intSummaryStatistics.getMax() = " + intSummaryStatistics.getMax());
        System.out.println("intSummaryStatistics.getAverage() = " + intSummaryStatistics.getAverage());
    }
}
