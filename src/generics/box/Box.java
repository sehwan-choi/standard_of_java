package generics.box;

import java.util.List;

public class Box <T>{

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }

    public static <T extends Fruit> void print(FruitBox<T> list) {
        list.getList().forEach(f -> System.out.println("f = " + f.print()));
    }
}
