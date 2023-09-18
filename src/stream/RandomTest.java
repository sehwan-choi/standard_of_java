package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomTest {

    public static void main(String[] args) {

        // 랜덤 난수
        new Random().ints().limit(10).forEach(x -> System.out.print(x + " "));
        System.out.println();

        new Random().ints(5).forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        new Random().doubles(10).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 지정된 랜덤 난수
        new Random().ints(1, 100).limit(10).forEach(x -> System.out.print(x + " "));
        System.out.println();

        new Random().ints(5, 100, 1000).forEach(x -> System.out.print(x + " "));
        System.out.println();

        new Random().doubles(10, 0.5, 0.7).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // iterate(), generate()
        Stream.iterate(0, x -> x+2).limit(10).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Stream.generate(() -> 1).limit(5).forEach(x -> System.out.print(x + " "));
        System.out.println();


    }
}
