package collection.comparator;

import java.util.Comparator;

public class FruitComparator implements Comparator<ComparatorFruit> {

    // 오름차순 정렬
    @Override
    public int compare(ComparatorFruit o1, ComparatorFruit o2) {
        // o1이 기준이 된다.

        // o.1 이 o.2 가격보다 크다면 1
        if (o1.getPrice() > o2.getPrice()) {
            return 1;

        // o.1 과 o.2 가격이 같다면 0
        } else if (o1.getPrice().equals(o2.getPrice())) {
            return 0;

        // o.1 이 o.2 가격보다 작다면 -1
        } else {
            return -1;
        }
    }
}
