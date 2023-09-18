package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CollectorTest {

    public static void main(String[] args) {

        String[] strArr = {"aaa","bbb","ccc"};

        List<String> list = List.of(strArr);
        String qqqq = list.stream().reduce("QQQQ", (a, b) -> {
            System.out.println("a = " + a + " b = " + b);
            return a + b;
        });
        System.out.println("reduce = " + qqqq);
    }
}
