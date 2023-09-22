package test.stream_test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] arr = new Integer[]{11,22,33,44,55};

        Stream<Integer> list1Stream = list1.stream();
        Stream<Integer> stream = Arrays.stream(arr);

        list1Stream.sorted().forEach(x -> System.out.println("x = " + x));
        stream.sorted().forEach(x -> System.out.println("x = " + x));
    }
}
