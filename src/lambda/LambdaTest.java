package lambda;

public class LambdaTest {

    public static void main(String[] args) {
        execute(() -> System.out.println("f1 call"));

        getMyFunction().run();

        MyFunction function = () -> System.out.println("f3 call");
        execute(function);
        function.run();

        MyFunction function1 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f4 call");
            }
        };

        function1.run();
    }

    public static void execute(MyFunction f) {
        f.run();
    }

    public static MyFunction getMyFunction() {
        return () -> System.out.println("f2 call");
    }

    @FunctionalInterface
    public interface MyFunction {

        void run();
    }
}
