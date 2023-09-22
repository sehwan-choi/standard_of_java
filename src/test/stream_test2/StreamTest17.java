package test.stream_test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest17 {

    public static void main(String[] args) {
        Stream<List<Integer>> listStream = Stream.of(List.of(1, 2, 3, 4, 5), List.of(6, 7, 8, 9, 10));
        Stream<Integer> integerStream = listStream.flatMap(x -> x.stream());
        integerStream.forEach(x -> System.out.println("x = " + x));
    }
}
