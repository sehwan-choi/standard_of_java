package test.functioninterface_test;

import java.util.List;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveTest {

    static IntStream intStream = new Random().ints(1,100).limit(10);

    public static void main(String[] args) {
        List<Double> collect = intStream.asDoubleStream().boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);

        IntUnaryOperator operator = i -> i + i;
        int i = operator.applyAsInt(19);
        System.out.println("i = " + i);

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("integers = " + integers);
    }
}
