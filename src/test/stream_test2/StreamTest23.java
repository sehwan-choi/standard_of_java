package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest23 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();

        list.forEach(System.out::println);
        System.out.println();


        Long count = list.stream().filter(f -> f.getScore() >= 250).count();
        System.out.println("count : " + count);

        Long counting = list.stream().filter(f -> f.getScore() >= 250).collect(Collectors.counting());
        System.out.println("counting : " + counting);

        Integer sum = list.stream().mapToInt(x -> x.getScore()).sum();
        System.out.println("sum : " + sum);

        Integer summingInt = list.stream().collect(Collectors.summingInt(x -> x.getScore()));
        System.out.println("summingInt : " + summingInt);

        OptionalDouble average = list.stream().mapToInt(x -> x.getScore()).average();
        System.out.println("average : " + average.getAsDouble());

        Double averagingInt = list.stream().collect(Collectors.averagingInt(s -> s.getScore()));
        System.out.println("averagingInt : " + averagingInt);

        Optional<Student> max = list.stream().max(Comparator.comparing(s -> s.getScore()));
        System.out.println("max : " + max.get());

        Optional<Student> maxBy = list.stream().collect(Collectors.maxBy(Comparator.comparing(s -> s.getScore())));
        System.out.println("maxBy : " + maxBy.get());

        Optional<Student> min = list.stream().min(Comparator.comparing(s -> s.getScore()));
        System.out.println("min : " + min.get());

        Optional<Student> minBy = list.stream().collect(Collectors.minBy(Comparator.comparing(s -> s.getScore())));
        System.out.println("minBy : " + minBy.get());

        IntSummaryStatistics summarizingInt = list.stream().collect(Collectors.summarizingInt(x -> x.getScore()));
        System.out.println("summarizingInt = " + summarizingInt);

        IntSummaryStatistics summaryStatistics = list.stream().mapToInt(x -> x.getScore()).summaryStatistics();
        System.out.println("summaryStatistics = " + summaryStatistics);
    }
}
