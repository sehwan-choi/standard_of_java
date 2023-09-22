package test.stream_test2;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTest6 {
    public static void main(String[] args) {
        IntStream ints = new Random().ints().limit(5);
        ints.forEach(x -> System.out.println("x = " + x));


        IntStream ints1 = new Random().ints(5);
        ints1.forEach(x -> System.out.println("x = " + x));

        IntStream ints2 = new Random().ints(1, 10).limit(5);
        ints2.forEach(x -> System.out.println("x = " + x));
    }
}
