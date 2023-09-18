package generics.test_g;

import generics.box.Apple;

public class Juicer<T extends Fruit> {

    T item;

    public Juicer(T item) {
        this.item = item;
    }

    public static <T extends Fruit> void print(FruitBox<T> box) {
        box.getList().forEach(f -> System.out.println("f = " + f));
    }

    public void print2(FruitBox<T> box) {
        box.getList().forEach(f -> System.out.println("f = " + f));
    }

}
