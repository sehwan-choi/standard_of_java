package test.stream_test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,4,2,7,8,4,5,3);

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

        System.out.println("Stream Sort");
        collect.forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("기존 데이터");
        list.forEach(x -> System.out.print(x + " "));
    }
}
