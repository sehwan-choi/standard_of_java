package test.stream_test2;

import java.util.List;

public class StreamTest10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 2, 3, 3, 4, 4);
        System.out.print("distinct : ");
        list.stream().distinct().forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.print("filter : ");
        list.stream().filter(f -> f % 2 == 0 ).forEach(x -> System.out.print(x + " "));
    }
}
