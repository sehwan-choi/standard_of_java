package lambda;

import java.util.function.Function;

public class AdvanceFunctionTest {

    public static void main(String[] args) {

        Function<String, String> a = i -> i + "A";
        Function<String, String> b = i -> i + "B";

        String apply = a.andThen(b).apply("1");
        System.out.println("andThen = " + apply);

        String apply1 = a.compose(b).apply("1");
        System.out.println("compose = " + apply1);

        Function<String, String> f = x -> x;
        Function<String, String> f2 = Function.identity();

        String stringApply = f.apply("1234");
        System.out.println("stringApply = " + stringApply);
        String stringApply2 = f2.apply("1234");
        System.out.println("stringApply2 = " + stringApply2);
    }
}
