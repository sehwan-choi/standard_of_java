package test.stream_test2;

import java.util.Random;
import java.util.stream.Stream;

public class StreamTest7 {

    public static void main(String[] args) {
        Stream.iterate(0, a -> a + 2).limit(5).forEach(x -> System.out.println("x = " + x));
        System.out.println();
        Stream.generate(() -> 1).limit(10).forEach(x -> System.out.println("x = " + x));

        Stream.iterate(0, a -> a + 2).limit(5).mapToInt(x -> x);
    }
}
