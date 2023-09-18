package generics.test_g;

public class GBox<T> {  //  제네릭타입 T 를 선언

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public GBox(T item) {
        this.item = item;
    }
}
