package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest30 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Map<Integer, List<Student>> studentMap = list.stream()
                .collect(Collectors.groupingBy(x -> x.getBan()));

        studentMap.forEach((x,y) -> {
            System.out.println(x + "반");
            y.forEach(z -> System.out.println(z));
            System.out.println();
        });
    }
}
