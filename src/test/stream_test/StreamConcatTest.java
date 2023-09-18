package test.stream_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatTest {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(11, 22, 33, 44, 55);
        Stream<Integer> stream = list1.stream();
        Stream<Integer> stream1 = list2.stream();
        Stream<Integer> concat = Stream.concat(stream, stream1);
        concat.forEach(x -> System.out.println("x = " + x));
    }
}
