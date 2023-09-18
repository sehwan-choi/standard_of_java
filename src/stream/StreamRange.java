package stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRange {

    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(0, 10).mapToObj(x -> x).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        List<Integer> collect2 = IntStream.rangeClosed(0, 10).mapToObj(x -> x).collect(Collectors.toList());
        System.out.println("collect = " + collect2);
    }
}
