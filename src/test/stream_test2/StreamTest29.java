package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest29 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Boolean, Map<Boolean, List<Student>>> studentMap = list.stream()
                .collect(Collectors.partitioningBy(
                        Student::isMale,
                        Collectors.partitioningBy((Student x) -> x.getScore() >= 150)
                    )
                );

        System.out.println("남학생 150점 이상 학생 리스트");
        studentMap.get(true).get(true).forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("남학생 150점 이하 학생 리스트");
        studentMap.get(true).get(false).forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("여학생 150점 이상 학생 리스트");
        studentMap.get(false).get(true).forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("여학생 150점 이하 학생 리스트");
        studentMap.get(false).get(false).forEach(x -> System.out.println(x));
        System.out.println();
    }
}
