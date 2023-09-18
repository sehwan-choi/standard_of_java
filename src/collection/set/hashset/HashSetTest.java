package collection.set.hashset;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        System.out.println("add4 = " + set.add("3"));
        System.out.println("add2 = " + set.add(5));
        System.out.println("add3 = " + set.add(13));
        System.out.println("add5 = " + set.add(4));
        System.out.println("add6 = " + set.add(4));
        System.out.println("add7 = " + set.add(null));
        set.add(11);
        System.out.println("add1 = " + set.add(1));

        System.out.println("set = " + set);
        set.add(99999999);
        set.add("4");
        set.add("34");

        set.iterator().forEachRemaining(m -> System.out.println("m = " + m));

        SortedSet<Integer> objects = new TreeSet<>();
        objects.add(5);
    }
}
