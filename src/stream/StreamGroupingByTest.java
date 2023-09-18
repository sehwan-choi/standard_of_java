package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByTest {

    public static void main(String[] args) {
        List<Student> init = init();
        Map<Integer, List<Student>> collect = init.stream().collect(Collectors.groupingBy(m -> m.getBan()));

        printf(collect);

        Map<Integer, Map<Integer, List<Student>>> collect1 = init.stream().collect(Collectors.groupingBy(x -> x.getHak(), Collectors.groupingBy(m -> m.getBan())));
        print2(collect1);

        Map<Student.LEVEL, List<Student>> collect2 = init.stream().sorted(Comparator.comparing(a -> a.getScore())).collect(Collectors.groupingBy(x -> {
            if (x.getScore() >= 250) return Student.LEVEL.HIGH;
            else if (x.getScore() >= 150) return Student.LEVEL.MID;
            else return Student.LEVEL.LOW;
        }));
        printf(collect2);

        Map<Student.LEVEL, Long> collect3 = init.stream().sorted(Comparator.comparing(a -> a.getHak())).collect(Collectors.groupingBy(x -> {
            if (x.getScore() >= 250) return Student.LEVEL.HIGH;
            else if (x.getScore() >= 150) return Student.LEVEL.MID;
            else return Student.LEVEL.LOW;
        }, Collectors.counting()));

        collect3.forEach((x, y) -> System.out.println("x = " + x + " y = " + y));

        Map<Student.LEVEL, Optional<Student>> collect4 = init.stream().sorted(Comparator.comparing(a -> a.getScore())).collect(Collectors.groupingBy(x -> {
            if (x.getScore() >= 250) return Student.LEVEL.HIGH;
            else if (x.getScore() >= 150) return Student.LEVEL.MID;
            else return Student.LEVEL.LOW;
        }, Collectors.maxBy(Comparator.comparing(k -> k.getScore()))));

        collect4.forEach((x, y) -> System.out.println("x = " + x + " y = " + y));
    }

    private static void print2(Map<?, Map<Integer, List<Student>>> collect1) {
        collect1.forEach((x,y) -> y.forEach((q,w) -> w.forEach(m -> System.out.println("hak = " + x + " ban = " + q + " m = " + m))));
    }

    private static void printf(Map<?, List<Student>> collect) {
        collect.forEach((x,y) -> y.forEach(m -> System.out.println("x = " + x + " m = " + m)));
    }

    public static List<Student> init() {
        return List.of(
                new Student("정상진", true, 1, 1, 300),
                new Student("김태호", false, 1, 1, 250),
                new Student("김선도", true, 1, 1, 200),
                new Student("구창현", true, 1, 2, 150),
                new Student("김현호", false, 1, 2, 100),
                new Student("황인규", false, 1, 3,50),
                new Student("강석현", true, 1, 3, 100),
                new Student("최세환", false, 1, 4,150),
                new Student("편도훈", false, 1, 4,200),
                new Student("멘티스", true, 1, 4,250),

                new Student("정상진", true, 2, 1, 300),
                new Student("김태호", false, 2, 1, 250),
                new Student("김선도", true, 2, 1, 200),
                new Student("구창현", true, 2, 2, 150),
                new Student("김현호", false, 2, 2, 100),
                new Student("황인규", true, 2, 3,50),
                new Student("강석현", true, 2, 3, 100),
                new Student("최세환", false, 2, 4,150),
                new Student("편도훈", false, 2, 4,200),
                new Student("멘티스", true, 2, 4,250)
        );
    }

}
