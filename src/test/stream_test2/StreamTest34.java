package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest34 {

    public static void main(String[] args) {

        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Integer, Map<Integer, Optional<Student>>> optionalStudent = list.stream().collect(
                Collectors.groupingBy(
                        Student::getHak,
                        Collectors.groupingBy(
                                Student::getBan,
                                Collectors.maxBy(Comparator.comparing(Student::getScore)))
                )
        );
        System.out.println("학년 별 최고점수(반, 학생)");
        optionalStudent.forEach((x,y) -> {
            System.out.println(x + "학년");
            y.forEach((q,w) -> {
                System.out.println(q + "반 " + w.get());
            });
        });
        System.out.println();

        Map<Integer, Map<Integer, Student>> student = list.stream().collect(
                Collectors.groupingBy(
                        Student::getHak,
                        Collectors.groupingBy(
                                Student::getBan,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Student::getScore)), Optional::get)
                        )
                )
        );
        System.out.println("학년 별 최고점수(반, 학생) - optional::get");
        student.forEach((x,y) -> {
            System.out.println(x + "학년");
            y.forEach((q,w) -> {
                System.out.println(q + "반 " + w);
            });
        });
    }
}
