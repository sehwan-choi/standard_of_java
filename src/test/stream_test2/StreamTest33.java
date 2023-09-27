package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest33 {
    public static void main(String[] args) {

        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Integer, Map<Integer, List<Student>>> collect = list.stream()
                .collect(Collectors.groupingBy(
                        Student::getHak,
                        Collectors.groupingBy(Student::getBan))
                );

        collect.forEach((x,y) -> {
            System.out.println(x + "학년");
            y.forEach((q,w) -> {
                System.out.println(q + "반");
                w.forEach(z -> System.out.println(z));
                System.out.println();
            });
        });
    }
}
