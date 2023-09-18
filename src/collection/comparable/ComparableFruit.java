package collection.comparable;

public class ComparableFruit implements java.lang.Comparable<ComparableFruit> {

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public ComparableFruit(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    private final String name;

    private final Integer price;

    @Override
    public int compareTo(ComparableFruit o) {
        // CompareTo는 자기 자신이 기준이 된다.
        // 오름차순 정렬

        // 자기자신의 price가 o.price보다 크다면 1
        if (this.price > o.price) {
            return 1;

        // 자기자신의 price가 o.price와 같다면 0
        } else if (this.price.equals(o.price)) {
            return 0;
        } else {

        // 자기자신의 price가 o.price보다 작다면 -1
            return -1;
        }
    }
}
