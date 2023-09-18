package collection.comparable;

import java.util.ArrayList;
import java.util.List;

public class Comparable {

    public static void main(String[] args) {

        List<ComparableFruit> comparatorFruits = new ArrayList<>();

        comparatorFruits.add(new ComparableFruit("A", 3000));
        comparatorFruits.add(new ComparableFruit("B", 10000));
        comparatorFruits.add(new ComparableFruit("C", 25000));
        comparatorFruits.add(new ComparableFruit("D", 15000));
        System.out.println("before = " + comparatorFruits);

        comparatorFruits.sort(new FruitComparableComparator());
        System.out.println("Ascending after = " + comparatorFruits);

        comparatorFruits.sort(new FruitComparableDescendingComparator());
        System.out.println("Descending after = " + comparatorFruits);
    }
}
