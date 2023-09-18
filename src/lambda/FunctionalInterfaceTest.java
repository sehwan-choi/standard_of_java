package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {

    static final Supplier<Integer> random = () -> (int)(Math.random() * 100)+1;
    static final Consumer<Integer> print = i -> System.out.print(i + " ");
    static final Function<Integer, Integer> compute = i -> i/10*10;
    static final Predicate<Integer> even = i -> i%2==0;

    public static void main(String[] args) {
        List<Integer> list = newRandomList(random);

        print(print, list);
        System.out.println();

        List<Integer> newList = newList(compute, list);

        print(print, newList);
        System.out.println();

        evenNum(even, list);
        System.out.println();

        // ----------------
        System.out.println();
        List<Integer> list1 = newRandomList(() -> (int) (Math.random() * 100) + 1);

        print(i -> System.out.print(i + " "), list1);
        System.out.println();

        List<Integer> newList1 = newList(i -> i / 10 * 10, list1);

        print(i -> System.out.print(i + " "), newList1);
        System.out.println();

        evenNum(i -> i%2==0, list1);
        // ---------------
    }

    public static <T> void evenNum(Predicate<T> predicate, List<T> list) {
        for (T i : list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static <T> List<T> newList(Function<T, T> function, List<T> list) {
        ArrayList<T> newList = new ArrayList<>();

        for (T i : list) {
            newList.add(function.apply(i));
        }

        return newList;
    }

    public static <T> void print(Consumer<T> consumer, List<T> list) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    public static <T> List<T> newRandomList(Supplier<T> supplier) {
        List<T> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
