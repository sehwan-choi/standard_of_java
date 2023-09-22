package test.stream_test2;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest14 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list2 = list.stream().filter(f -> f % 2 == 0)
                .peek(x -> System.out.println("x = " + x))
                .filter(ff -> ff % 4 ==0)
                .collect(Collectors.toList());

        System.out.println();
        list2.forEach(x -> System.out.println("x = " + x));
    }
}
