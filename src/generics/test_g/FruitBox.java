package generics.test_g;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {

    private final List<T> list = new ArrayList<>();

    public void add(T data) {
        list.add(data);
    }

    public List<T> getList() {
        return list;
    }
}

