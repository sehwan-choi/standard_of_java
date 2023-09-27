package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest32 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Student.LEVEL, List<Student>> levelMap = list.stream().collect(Collectors.groupingBy(s -> {
            if (s.getScore() >= 200)
                return Student.LEVEL.HIGH;
            else if (s.getScore() >= 100)
                return Student.LEVEL.MID;
            else
                return Student.LEVEL.LOW;
        }));

        levelMap.forEach((x,y) -> {
            System.out.println(x.name() + "등급");
            y.forEach(z -> System.out.println(z));
            System.out.println();
        });
    }
}
