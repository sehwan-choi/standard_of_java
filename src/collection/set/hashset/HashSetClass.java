package collection.set.hashset;

import java.util.HashSet;
import java.util.List;

public class HashSetClass {

    public static void main(String[] args) {
        HashSet<Fruit> set = new HashSet<>();
        System.out.println("add1 = " + set.add(new Fruit(1, 10000)));
        System.out.println("add2 = " + set.add(new Fruit(1, 10000)));

        System.out.println("set = " + set);
    }
}
