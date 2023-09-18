package test.lambda_test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaTest {

    static Predicate<Integer> even = i -> i%2==0;

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(0, 50).mapToObj(x -> x * 2).collect(Collectors.toList());
        List<Integer> list2 = IntStream.rangeClosed(0, 50).filter(x -> x%2 == 1).mapToObj(x -> x).collect(Collectors.toList());
        List<Integer> random = new Random().ints(0, 100).limit(50).sorted().mapToObj(m -> m).collect(Collectors.toList());

        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println("random = " + random);

        random.removeIf(even);
        System.out.println("random = " + random);
//        random.replaceAll(m -> m > 50 ? 0 : 1);
//        System.out.println("random = " + random);

        Map<Integer, Integer> collect = random.stream().distinct().collect(Collectors.toMap(x -> x, x -> x));
        collect.put(1,1);
        System.out.println("collect = " + collect);

        Integer compute = collect.compute(1, (a, b) -> b + 10);
        System.out.println("compute = " + compute);
        System.out.println("collect = " + collect);
    }
}
