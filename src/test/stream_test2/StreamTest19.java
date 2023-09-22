package test.stream_test2;

import java.util.List;

public class StreamTest19 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Integer findFirst = list.stream().filter(x -> x % 2 == 0).findFirst().get();
        Integer findAny = list.stream().parallel().filter(x -> x % 2 == 0).findAny().get();
        System.out.println("findFirst = " + findFirst);
        System.out.println("findAny = " + findAny);
    }
}
