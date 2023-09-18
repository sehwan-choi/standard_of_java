package lambda;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println("name = " + s);

        consumer.accept("BYE");

        Consumer<String> consumer2 = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println("name = " + s);
            }
        };

        consumer2.accept("NO");
    }
}
