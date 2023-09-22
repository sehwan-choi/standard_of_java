package test.stream_test;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamStatisticsAndReducingTest {

    public static void main(String[] args) {
        List<Integer> list = new Random().ints(1, 1000).limit(10).boxed().collect(Collectors.toList());
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("intSummaryStatistics.getSum() = " + intSummaryStatistics.getSum());
        System.out.println("intSummaryStatistics.getMin() = " + intSummaryStatistics.getMin());
        System.out.println("intSummaryStatistics.getMax() = " + intSummaryStatistics.getMax());
        System.out.println("intSummaryStatistics.getCount() = " + intSummaryStatistics.getCount());
        System.out.println("intSummaryStatistics.getAverage() = " + intSummaryStatistics.getAverage());
        System.out.println();

        Integer sum = list.stream().collect(Collectors.summingInt(x -> x));
        System.out.println("sum = " + sum);

        Integer min = list.stream().collect(Collectors.minBy(Comparator.comparing(x -> x))).get();
        System.out.println("min = " + min);

        Integer max = list.stream().collect(Collectors.maxBy(Comparator.comparing(x -> x))).get();
        System.out.println("max = " + max);

        Long count = list.stream().collect(Collectors.counting());
        System.out.println("count = " + count);

        Double average = list.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("average = " + average);

        Integer reducingSum = list.stream().collect(Collectors.reducing((a, b) -> a + b)).get();
        System.out.println("reducingSum = " + reducingSum);
    }
}
