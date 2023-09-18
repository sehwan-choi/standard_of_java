package collection.comparator;

import java.util.ArrayList;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {

        List<ComparatorFruit> comparatorFruits = new ArrayList<>();

        comparatorFruits.add(new ComparatorFruit("A", 3000));
        comparatorFruits.add(new ComparatorFruit("B", 10000));
        comparatorFruits.add(new ComparatorFruit("C", 25000));
        comparatorFruits.add(new ComparatorFruit("D", 15000));
        System.out.println("before = " + comparatorFruits);

        comparatorFruits.sort(new FruitComparator());
        System.out.println("Ascending after = " + comparatorFruits);

        comparatorFruits.sort(new FruitDescendingComparator());
        System.out.println("Descending after = " + comparatorFruits);
    }
}
