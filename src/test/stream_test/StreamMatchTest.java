package test.stream_test;

import stream.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMatchTest {

    public static void main(String[] args) {
        List<Student> init = InitTest.init();

        List<Student> collect = init.stream().sorted(Comparator.comparing((Student m) -> m.getScore()).reversed()).limit(3).collect(Collectors.toList());
        collect.forEach(m -> System.out.println("m = " + m));

        boolean b = collect.stream().allMatch(s -> s.getName().equals("정상진") || s.getName().equals("김태호"));
        System.out.println("allMatch 정상진, 김태호 = " + b);

        boolean b1 = collect.stream().allMatch(s -> s.getName().equals("정상진"));
        System.out.println("AllMatch 정상진 = " + b1);

        boolean b2 = collect.stream().anyMatch(s -> s.getName().equals("정상진"));
        System.out.println("anyMatch 정상진 = " + b2);

        boolean b3 = collect.stream().noneMatch(s -> s.getName().equals("바보"));
        System.out.println("noneMatch 바보 = " + b3);

        boolean b4 = collect.stream().noneMatch(s -> s.getName().equals("정상진"));
        System.out.println("noneMatch 정상진 = " + b4);
    }
}
