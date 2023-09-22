package test.stream_test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamConvertTest {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(1, 100).limit(10).boxed().collect(Collectors.toList());

        Set<Integer> set = new Random().ints(1, 100).limit(10).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> map = new Random().ints(1, 100).distinct().limit(10).boxed().collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println("map = " + map);
        ArrayList<Integer> arrayList = new Random().ints(1, 100).limit(10).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
    }
}
