package collection.set.hashset;

import java.util.Objects;

public class Fruit {

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    private final int id;

    private final int price;

    public Fruit(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return id == fruit.id && price == fruit.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }
}
