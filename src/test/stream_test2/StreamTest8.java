package test.stream_test2;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest8 {

    public static void main(String[] args) {
        Stream<String> stream1 = List.of("aa", "bb", "cc", "dd").stream();
        Stream<String> stream2 = List.of("AA", "BB", "CC", "DD").stream();

        Stream.concat(stream1, stream2).forEach(x -> System.out.println("x = " + x));
    }
}
