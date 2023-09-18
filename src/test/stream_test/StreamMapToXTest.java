package test.stream_test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;

public class StreamMapToXTest {
    public static void main(String[] args) {
        List<String> list = List.of("1", "5", "6", "3", "4");

        list.stream().mapToInt(Integer::parseInt).sorted().forEach(x -> System.out.println("x = " + x));
        System.out.println();

        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("sum = " + sum);
        System.out.println();

        list.stream().mapToLong(Long::parseLong).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        double asDouble = list.stream().mapToLong(Long::parseLong).average().getAsDouble();
        System.out.println("asDouble = " + asDouble);
        System.out.println();

        list.stream().mapToDouble(Double::parseDouble).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        DoubleSummaryStatistics doubleSummaryStatistics = list.stream().mapToDouble(Double::parseDouble).summaryStatistics();
        System.out.println("doubleSummaryStatistics.getSum() = " + doubleSummaryStatistics.getSum());
        System.out.println("doubleSummaryStatistics.getCount() = " + doubleSummaryStatistics.getCount());
        System.out.println("doubleSummaryStatistics.getAverage() = " + doubleSummaryStatistics.getAverage());
        System.out.println("doubleSummaryStatistics.getMin() = " + doubleSummaryStatistics.getMin());
        System.out.println("doubleSummaryStatistics.getMax() = " + doubleSummaryStatistics.getMax());

        System.out.println();

        new Random().ints(1, 46).distinct().limit(6).sorted().boxed().forEach(x -> System.out.println("x = " + x));
    }
}
