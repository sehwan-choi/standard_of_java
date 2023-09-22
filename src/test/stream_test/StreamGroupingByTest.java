package test.stream_test;

import stream.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByTest {
    public static void main(String[] args) {
        List<Student> init = InitTest.init();
        Map<Integer, List<Student>> collect = init.stream().collect(Collectors.groupingBy(x -> x.getHak()));
        collect.forEach((x, y) -> y.stream().forEach(m -> System.out.println("m = " + m)));
        System.out.println();

        Map<Integer, List<Student>> collect1 = init.stream().collect(Collectors.groupingBy(x -> x.getBan()));
        collect1.forEach((x, y) -> y.stream().forEach(m -> System.out.println("m = " + m)));

        Map<Student.LEVEL, List<Student>> collect2 = init.stream().sorted(Comparator.comparing((Student x) -> x.getScore()).reversed()).collect(Collectors.groupingBy(x -> {
            if (x.getScore() >= 250) return Student.LEVEL.HIGH;
            else if (x.getScore() >= 150) return Student.LEVEL.MID;
            else return Student.LEVEL.LOW;
        }));
        System.out.println();

        for (Student.LEVEL level : collect2.keySet()) {
            collect2.get(level).stream().forEach(x -> System.out.println(level+ " x = " + x));
        }
    }
}
