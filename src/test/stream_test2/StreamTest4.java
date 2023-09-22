package test.stream_test2;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
        Stream<Integer> stream = List.of(1, 2, 3, 4, 5, 6, 7, 8).stream();

        stream.sorted().forEach(x -> System.out.println(x + " "));

        stream.filter(f -> f % 2 == 0).forEach(x -> System.out.println(x + " "));
    }
}
