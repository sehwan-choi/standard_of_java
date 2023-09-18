package lambda;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String, String> stringIntegerFunction = (String name) -> {
            return 999 + name;
        };

        System.out.println("stringIntegerFunction.apply(\"hi\") = " + stringIntegerFunction.apply("hi"));
    }
}
