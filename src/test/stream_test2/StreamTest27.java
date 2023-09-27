package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest27 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        // 총 학생수
        long count = list.stream().count();
        System.out.println("총 학생수 : " + count);

        // 총 점
        int sum = list.stream().mapToInt(x -> x.getScore()).sum();
        System.out.println("촘점 : " + sum);

        // 남/여 학생수 통계 counting
        Map<Boolean, Long> studentCount = list.stream()
                .collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));

        System.out.println("남학생 수 : " + studentCount.get(true));
        System.out.println("여학생 수 : " + studentCount.get(false));

        // 남/여 별 총점
        Map<Boolean, Integer> studentSum = list.stream()
                .collect(Collectors.partitioningBy(Student::isMale, Collectors.summingInt(x -> x.getScore())));

        System.out.println("남학생 총점 : " + studentSum.get(true));
        System.out.println("여학생 총점 : " + studentSum.get(false));
    }
}
