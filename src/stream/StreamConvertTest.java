package stream;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConvertTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        list.stream().mapToInt(x -> x).forEach(x -> System.out.println("x = " + x));

        List<List<Integer>> lists = List.of(List.of(1, 2, 3, 4), List.of(5,6,7,8));
        List<Integer> collect = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        collect.forEach(x -> System.out.println("x = " + x));

        System.out.println();

        new Random().ints(0,100).limit(10).forEach(x -> System.out.println("x = " + x));
    }
}
