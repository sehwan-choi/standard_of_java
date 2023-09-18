package test.stream_test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream.iterate(5, x -> x + 1).limit(5).forEach(m -> System.out.println("m = " + m));
        System.out.println();
        Stream.generate(() -> new Random().ints(1,10).limit(1).sum()).limit(5).forEach(x -> System.out.println("x = " + x));
        System.out.println();
        List<Integer> integers = List.of(1, 2, 3, 4);
        integers.stream().mapToInt(x -> x).forEach(m -> System.out.println("m = " + m));
    }
}
