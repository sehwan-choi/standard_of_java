package stream;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

public class StreamEtcTest {

    public static void main(String[] args) {
        List<String> list1 = List.of("AAA", "BBB", "CCC");
        Integer[] arr = new Integer[]{1,2,3,4};

        Stream<String> stream = list1.stream();
        Stream<Integer> stream1 = Stream.of(arr);

        Stream<? extends Serializable> concat = Stream.concat(stream, stream1);

        concat.forEach(x -> System.out.println("x = " + x));
    }
}
