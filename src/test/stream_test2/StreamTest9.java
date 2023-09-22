package test.stream_test2;

import java.util.List;

public class StreamTest9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("skip: ");
        list.stream().skip(3).forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.print("limit : ");
        list.stream().limit(5).forEach(x -> System.out.print(x + " "));
    }
}
