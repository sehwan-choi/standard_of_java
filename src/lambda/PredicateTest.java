package lambda;

import java.awt.*;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println("predicate = " + predicate.test(2));
        System.out.println("predicate = " + predicate.test(1));
    }
}
