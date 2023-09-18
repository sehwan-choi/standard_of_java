package test.functioninterface_test;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryTest {

    static UnaryOperator<BiClass> unaryOperator = a -> new BiClass(a.getA() + "Unary", a.getB() + 999);
    static BinaryOperator<BiClass> binaryOperator = (a,b) -> new BiClass(a.getA(), b.getB());

    public static void main(String[] args) {
        BiClass hello = new BiClass("Hello ", 1);
        BiClass apply = unaryOperator.apply(hello);
        System.out.println("apply = " + apply);

        BiClass apply1 = binaryOperator.apply(hello, apply);
        System.out.println("apply1 = " + apply1);
    }
}
