package test.stream_test;

import stream.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortMapTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 3, 2534, 84, 6, 531, 10, 54, 3, 4);
        list.stream().sorted().forEach(x -> System.out.println("x = " + x));
        System.out.println();

        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        List<String> list2 = List.of("ab", "are", "raer", "x", "v", "rawd");

        list2.stream().sorted(Comparator.comparing((String a) -> a.length()).reversed()).forEach(x -> System.out.println("x = " + x));
        System.out.println();
        list2.stream().sorted(Comparator.comparing(a -> a.length())).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        list2.stream().sorted(Comparator.comparing((String a) -> a.length()).thenComparing(Comparator.naturalOrder())).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        List<Student> init = InitTest.init();
        init.stream().sorted(Comparator.comparing((Student s) -> s.getScore()).reversed().thenComparing((Student a) -> a.getBan())).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        init.stream().sorted(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getHak)).limit(5).map(m -> List.of(m.getName())).collect(Collectors.toList()).forEach(x -> System.out.println("x = " + x));
    }
}
