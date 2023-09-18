package lambda;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Object> supplier = new Supplier<>() {
            @Override
            public Object get() {
                return "GOOD";
            }
        };

        System.out.println("supplier = " + supplier.get());

        Supplier<String> supplier1 = () -> { return "HI";};

        System.out.println("supplier1 = " + supplier1.get());
    }
}
