package test.stream_test;

import java.util.List;

public class StreamSkipLimitFilterDistinctTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        list.stream().skip(5).forEach(x -> System.out.println("x = " + x));
        System.out.println();
        list.stream().limit(5).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        list.stream().filter(f -> f%2==0).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        list.stream().distinct().forEach(x -> System.out.println("x = " + x));
    }
}
