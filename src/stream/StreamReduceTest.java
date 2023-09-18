package stream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamReduceTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,5,7);

        Integer reduce = list.stream().reduce((a, b) -> {
            System.out.println("a : " + a + " b : " + b);
            return a+b;
        }).get();
        System.out.println("reduce = " + reduce);


        List<Integer> collect = IntStream.rangeClosed(1, 5).mapToObj(a -> a * 10).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
