package test.stream_test2;

import java.util.List;

public class StreamTest11 {

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 4, 2, 8, 6, 5, 7, 9);
        list.stream().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
