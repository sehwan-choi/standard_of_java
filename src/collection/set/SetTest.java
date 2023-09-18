package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Q");
        set.add("A");
        set.add("B");
        set.add("M");
        set.add("L");
        set.add("N");

        for (String s : set) {
            System.out.println("iterator = " + s);
        }
    }
}
