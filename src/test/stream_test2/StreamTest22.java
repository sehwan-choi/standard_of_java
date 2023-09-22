package test.stream_test2;

import test.stream_test.ArrayTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest22 {

    static Predicate<Integer> even = x -> x % 2 ==0;
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream().filter(even).collect(Collectors.toList());
        Set<Integer> set = list.stream().filter(even).collect(Collectors.toSet());
        Map<Integer, String> map = list.stream().filter(even).collect(Collectors.toMap(x -> x, y -> ("key_" + y)));
        ArrayList<Integer> collection = list.stream().filter(even).collect(Collectors.toCollection(() -> new ArrayList<>()));
    }
}
