package collection.comparable;

import java.util.Comparator;

public class FruitComparableDescendingComparator implements Comparator<ComparableFruit> {

    @Override
    public int compare(ComparableFruit o1, ComparableFruit o2) {
        // o1이 기준이 된다.

        // o.1 이 o.2 가격보다 크다면 1
        // o.1 과 o.2 가격이 같다면 0
        // o.1 이 o.2 가격보다 작다면 -1
        return o1.compareTo(o2) * -1;
//        return o2.compareTo(o1);
    }
}
