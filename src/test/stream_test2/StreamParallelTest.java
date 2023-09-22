package test.stream_test2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamParallelTest {

    public static void main(String[] args) {
        List<Integer> list = new Random().ints(1, 1000).limit(10).mapToObj(x -> x).collect(Collectors.toList());
        list.stream().parallel().forEach(x -> System.out.println(Thread.currentThread().getName() + " # " + x));

        System.out.println();

        list.stream().forEach(x -> System.out.println(Thread.currentThread().getName() + " # " + x));
    }
}
