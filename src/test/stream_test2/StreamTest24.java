package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest24 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .limit(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        Optional<Integer> reduce = list.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .limit(5)
                .map(Student::getScore)
                .reduce((x, y) -> {
                    System.out.println(x + "+" + y + "=" + (x + y));
                    return x + y;
                });
        System.out.println("reduce = " + reduce.get());
        System.out.println();

        Optional<Integer> reducingSum = list.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .limit(5)
                .map(Student::getScore)
                .collect(Collectors.reducing((x, y) -> {
                    System.out.println(x + "+" + y + "=" + (x+y));
                    return x+y;
                }));
        System.out.println("reducingSum = " + reducingSum.get());

    }
}
