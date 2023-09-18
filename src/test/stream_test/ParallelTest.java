package test.stream_test;

import time.TimeChecker;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelTest {

    public static void main(String[] args) {

        TimeChecker timeChecker = new TimeChecker();
        timeChecker.start();
        List<Integer> collect = new Random().ints(0, 10000000).limit(200000000).boxed().collect(Collectors.toList());
        timeChecker.end();

        // 스트림 병렬 처리
        timeChecker.start();
        int asInt = collect.stream().mapToInt(x -> x).parallel().reduce((a, b) -> a + b).getAsInt();
        timeChecker.end();
        System.out.println("asInt = " + asInt);

        // 스트림 순차 처리
        timeChecker.start();
        int asInt1 = collect.stream().mapToInt(x -> x).sequential().reduce((a, b) -> a + b).getAsInt();
        timeChecker.end();
        System.out.println("asInt1 = " + asInt1);

        // 스트림 boxing처리
        timeChecker.start();
        Integer integer = collect.stream().reduce((a, b) -> a + b).get();
        timeChecker.end();
        System.out.println("integer = " + integer);
    }
}
