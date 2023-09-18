package test.stream_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "q", "f");
        List<String> list2 = List.of("esd", "vdas", "rd", "dff");

        Stream<List<String>> lists = Stream.of(list1, list2);
        lists.flatMap(x -> x.stream()).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        String[] lineArr = {
                "Belive or not It is true",
                "Do or do not There is no try"
        };

        Arrays.stream(lineArr).flatMap(x -> Arrays.stream(x.split(" ")));
    }
}
