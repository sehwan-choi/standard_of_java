package test.functioninterface_test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiTest {
    static BiFunction<String, Integer, BiClass> biFunction = (String a,Integer b) -> new BiClass(a,b);
    static BiConsumer<Integer, BiClass> biConsumer = (a,b) -> System.out.println(b.getB() + a + " # " + b.getA());

    static BiPredicate<BiClass, BiClass> biPredicate = (a,b) -> a.equals(b);

    public static void main(String[] args) {
        BiClass hello = biFunction.apply("Hello", 1);
        System.out.println(hello);

        biConsumer.accept(999, hello);
        BiClass hello1 = new BiClass("Hello1", 2);
        boolean test = biPredicate.test(hello, hello1);
        System.out.println("test = " + test);
    }

}
