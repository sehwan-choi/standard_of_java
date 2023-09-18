package lambda;

import java.util.function.Predicate;

public class AdvancePredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2==0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> test1 = notP.and(q.or(r));
        Predicate<Integer> test2 = p.and(q.and(r));
        System.out.println("test1.test(150) = " + test1.test(150));
        System.out.println("test1.test(50) = " + test1.test(50));
        System.out.println("test2.test(50) = " + test2.test(50));
        System.out.println("test2.test(150) = " + test2.test(150));
    }
}
