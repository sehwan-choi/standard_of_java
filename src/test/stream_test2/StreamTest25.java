package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest25 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.stream().sorted(Comparator.comparing(Student::getScore)).forEach(x -> System.out.println(x));
        System.out.println();

        String joining1 = list.stream()
                .sorted(Comparator.comparing(Student::getScore)
                        .thenComparing(Comparator.comparing(Student::getName)))
                .limit(5)
                .map(x -> x.getName())
                .collect(Collectors.joining());
        System.out.println("joining1 = " + joining1);

        String joining2 = list.stream()
                .sorted(Comparator.comparing(Student::getScore)
                        .thenComparing(Comparator.comparing(Student::getName)))
                .limit(5)
                .map(x -> x.getName())
                .collect(Collectors.joining(","));
        System.out.println("joining2 = " + joining2);

        String joining3 = list.stream()
                .sorted(Comparator.comparing(Student::getScore)
                        .thenComparing(Comparator.comparing(Student::getName)))
                .limit(5)
                .map(x -> x.getName())
                .collect(Collectors.joining(",","[","]"));
        System.out.println("joining3 = " + joining3);

    }
}
