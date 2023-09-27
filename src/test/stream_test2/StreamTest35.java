package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest35 {

    public static void main(String[] args) {


        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Integer, Map<Integer, Set<Student.LEVEL>>> collect = list.stream()
                .collect(
                        Collectors.groupingBy(Student::getHak,
                                Collectors.groupingBy(Student::getBan,
                                        Collectors.mapping(x -> {
                                            if (x.getScore() >= 200)
                                                return Student.LEVEL.HIGH;
                                            else if (x.getScore() >= 100)
                                                return Student.LEVEL.MID;
                                            else
                                                return Student.LEVEL.LOW;
                                        }, Collectors.toSet())
                                )
                        ));

        collect.forEach((x,y) -> {
            y.forEach((q,w) -> {
                System.out.println("[" + x + "-" + q + "] " + w);
            });
        });
    }
}
