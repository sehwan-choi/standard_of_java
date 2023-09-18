package test.stream_test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayTest {

    public static void main(String[] args) {
        String[] arr = {"aa","bb","cc"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> stream1 = List.of(arr).stream();

        List<String> collect = Stream.concat(stream1, stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
