package generics.box;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> extends Fruit{

    private final List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public List<T> getList() {
        return list;
    }
    @Override
    public String print() {
        return "Fruit Box";
    }
}
