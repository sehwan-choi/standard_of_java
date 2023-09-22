package test.stream_test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamJoiningTest {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(1, 1000).limit(10).boxed().collect(Collectors.toList());
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        String collect = list.stream().map(String::valueOf).collect(Collectors.joining(",","[","]"));
        System.out.println("collect = " + collect);
    }
}
