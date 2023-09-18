package stream;

import java.util.List;

public class StreamMatchTest {

    public static void main(String[] args) {
        boolean b = List.of(70, 60, 90, 140, 30).stream().allMatch(m -> m >= 30);
        System.out.println("b = " + b);

        boolean b1 = List.of(70, 60, 90, 140, 30).stream().anyMatch(m -> m.equals(30));
        System.out.println("b1 = " + b1);

        boolean b2 = List.of(70, 60, 90, 140, 30).stream().noneMatch(m -> m.equals(100));
        System.out.println("b2 = " + b2);
    }
}
