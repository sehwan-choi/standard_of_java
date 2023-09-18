package generics.test_g;

public class Box {

    Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Box(Object item) {
        this.item = item;
    }
}
