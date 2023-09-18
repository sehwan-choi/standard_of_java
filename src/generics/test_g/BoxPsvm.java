package generics.test_g;

import java.util.ArrayList;

public class BoxPsvm {

    public static void main(String[] args) {
        GBox<String> stringBox = new GBox<>("AAA");
        System.out.println("objectBox.getItem() = " + stringBox.getItem());

        GBox<Integer> intBox = new GBox<>(123);
        System.out.println("objectBox.getItem() = " + intBox.getItem());


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
//        integers.add("1");  //  Error : Integer 타입만 Add 할수 있음
        integers.add(2);
        integers.add(3);

        Integer integer = integers.get(0);
        Integer integer2 = integers.get(1);
        Integer integer3 = integers.get(2);
//        String integer4 = integers.get(2);  //  Error : Integer 타입만 받을수 있음

        System.out.println("integer = " + integer);
        System.out.println("integer2 = " + integer2);
        System.out.println("integer3 = " + integer3);
    }
}
