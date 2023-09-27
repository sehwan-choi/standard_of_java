package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest26 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Boolean, List<Student>> studentMap = list.stream()
                .collect(Collectors.partitioningBy(x -> x.isMale()));

        System.out.println("남학생 출력");
        studentMap.get(true)
                .stream()
                .sorted(Comparator.comparing(Student::getScore).reversed()
                        .thenComparing(Comparator.comparing(x -> x.getName())))
                .forEach(x -> System.out.println(x));
        System.out.println();

        // 여학생 출력
        System.out.println("여학생 출력");
        studentMap.get(false)
                .stream()
                .sorted(Comparator.comparing(Student::getScore).reversed()
                        .thenComparing(Comparator.comparing(x -> x.getName())))
                .forEach(x -> System.out.println(x));
    }
}
