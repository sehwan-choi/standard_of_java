package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamTest15 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        IntStream intStream = list.stream().mapToInt(x -> x.getScore());
        System.out.println("total Score : " + intStream.sum());

        LongStream longStream = list.stream().mapToLong(x -> x.getScore());
        System.out.println("Max Score : " + longStream.max().getAsLong());

        DoubleStream doubleStream = list.stream().mapToDouble(x -> x.getScore());
        System.out.println("Average : " + doubleStream.average().getAsDouble());
    }
}
