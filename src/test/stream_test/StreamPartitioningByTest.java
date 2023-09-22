package test.stream_test;

import stream.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPartitioningByTest {
    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        Map<Boolean, List<Student>> collect = list.stream().collect(Collectors.partitioningBy(s -> s.isMale()));
        collect.get(true).stream().forEach(s -> System.out.println("s = " + s));
        System.out.println();
        collect.get(false).stream().forEach(s -> System.out.println("s = " + s));

        Map<Boolean, Long> collect2 = list.stream().collect(Collectors.partitioningBy(s -> s.isMale(), Collectors.counting()));
        System.out.println("collect2 = " + collect2);
        System.out.println();

        Map<Boolean, Optional<Student>> collect3 = list.stream().collect(Collectors.partitioningBy(s -> s.isMale(), Collectors.maxBy(Comparator.comparing(x -> x.getScore()))));
        System.out.println("collect3 = " + collect3);
        System.out.println();

        Map<Boolean, Map<Integer, List<Student>>> collect1 = list.stream().collect(Collectors.partitioningBy(s -> s.isMale(), Collectors.groupingBy(s -> s.getBan())));
        collect1.get(true).forEach((x,y) -> System.out.println("x = " + x + " y = " + y));
        System.out.println();

        Map<Boolean, Map<Boolean, List<Student>>> collect4 = list.stream().collect(Collectors.partitioningBy(s -> s.isMale(), Collectors.partitioningBy(x -> x.getScore() < 150)));
        List<Student> students = collect4.get(true).get(true);
        System.out.println("male, score < 150 = " + students);
        List<Student> students2 = collect4.get(true).get(false);
        System.out.println("male, score >= 150 = " + students2);
    }
}
