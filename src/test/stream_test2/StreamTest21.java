package test.stream_test2;

import java.util.List;

public class StreamTest21 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer integer = list.stream().reduce(100, (x, y) -> {
            System.out.println(x + " + " + y + " = " + (x + y));
            return x + y;
        });
        System.out.println("sum = " + integer);
    }
}
