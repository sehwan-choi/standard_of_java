package collection.comparator;

public class ComparatorFruit {

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public ComparatorFruit(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    private final String name;

    private final Integer price;
}
