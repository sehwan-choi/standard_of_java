package test.stream_test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduceTest {

    public static void main(String[] args) {
        List<Integer> list = new Random().ints(1, 100).limit(10).boxed().collect(Collectors.toList());
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        Integer integer = list.stream().reduce((a, b) -> a + b).get();
        System.out.println("integer = " + integer);
    }
}
