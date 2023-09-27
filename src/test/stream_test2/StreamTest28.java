package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest28 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        // 남/여 별 최고득점자 Optional
        Map<Boolean, Optional<Student>> maxScoreOptional = list.stream()
                .collect(
                        Collectors.partitioningBy(
                                Student::isMale, Collectors.maxBy(Comparator.comparingInt(Student::getScore))
                        )
                );

        System.out.println("남학생 최고 득점자 : " + maxScoreOptional.get(true).get());
        System.out.println("여학생 최고 득점자 : " + maxScoreOptional.get(false).get());

        // 남/여 별 최고득점자 Optional 제거
        Map<Boolean, Student> maxScore2 = list.stream()
            .collect(
                Collectors.partitioningBy(
                    Student::isMale, Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Comparator.comparingInt(Student::getScore)), Optional::get
                    )
                )
            );

        System.out.println("남학생 최고 득점자 : " + maxScore2.get(true));
        System.out.println("여학생 최고 득점자 : " + maxScore2.get(false));
    }
}
