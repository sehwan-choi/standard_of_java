package collection.list;

import common.TestClass;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {

        ArrayList<TestClass> list = new ArrayList<TestClass>();
        list.add(new TestClass(1,"A"));
        list.add(new TestClass(4,"B"));
        list.add(new TestClass(2,"C"));
        list.add(new TestClass(3,"D"));

//        list.sort(new TestComparator());
//        list.forEach(e -> System.out.println("e = " + e));
    }
}
