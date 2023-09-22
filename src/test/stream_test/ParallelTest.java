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
        List<Integer> collect = new Random().ints(0, 10000000).limit(100000000).boxed().collect(Collectors.toList());
        timeChecker.end();

        // IntStream 스트림 병렬 처리
        timeChecker.start();
        int asInt = collect.stream().mapToInt(x -> x).parallel().reduce(Integer::sum).getAsInt();
        timeChecker.end();
        System.out.println("IntStream 병렬 처리 = " + asInt);

        // IntStream 스트림 순차 처리
        timeChecker.start();
        int asInt1 = collect.stream().mapToInt(x -> x).sequential().reduce(Integer::sum).getAsInt();
        timeChecker.end();
        System.out.println("IntStream 순차 처리 = " + asInt1);

        // Stream<T> 병렬 처리
        timeChecker.start();
        Integer integer = collect.stream().parallel().reduce(Integer::sum).get();
        timeChecker.end();
        System.out.println("Stream<T> 병렬 처리 = " + integer);

        // Stream<T>  순차 처리
        timeChecker.start();
        Integer integer2 = collect.stream().reduce(Integer::sum).get();
        timeChecker.end();
        System.out.println("Stream<T> 순차 처리 = " + integer2);
    }
}
