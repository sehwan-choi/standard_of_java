package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFlatMapTest {

    public static void main(String[] args) {

        List<List<StreamSortTest.Student>> lists = List.of(
                List.of(new StreamSortTest.Student(1, 10, "A"),
                        new StreamSortTest.Student(5, 60, "B")),
                List.of(new StreamSortTest.Student(5, 60, "AA"),
                        new StreamSortTest.Student(5, 30, "BB")),
                List.of(new StreamSortTest.Student(1, 40, "D"),
                        new StreamSortTest.Student(1, 40, "D"))
        );

        List<StreamSortTest.Student> collect = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        Optional<Object> empty = Optional.empty();
    }
}
