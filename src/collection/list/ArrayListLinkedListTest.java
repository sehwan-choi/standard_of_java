package collection.list;

import common.TestClass;
import time.TimeChecker;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListTest {

    public static void main(String[] args) {

        TimeChecker tc = new TimeChecker();

        ArrayList arrayList = new ArrayList(2000000);
        LinkedList linkedList = new LinkedList();

        System.out.println("순차적으로 추가하기");
        tc.start();
        for (int i = 0 ; i <1000000 ; i ++) arrayList.add(i+"");
        tc.end();

        tc.start();
        for (int i = 0 ; i <1000000 ; i ++) linkedList.add(i+"");
        tc.end();
        System.out.println("---------------");

        System.out.println("중간에 추가하기");
        tc.start();
        for (int i = 0 ; i <10000 ; i ++) arrayList.add(500, i+"");
        tc.end();

        tc.start();
        for (int i = 0 ; i <10000 ; i ++) linkedList.add(500, i+"");
        tc.end();
        System.out.println("---------------");

        System.out.println("중간에서 삭제하기");
        tc.start();
        for (int i = 500 ; i < 10000 ; i++) arrayList.remove(i);
        tc.end();

        tc.start();
        for (int i = 500 ; i < 10000 ; i++) linkedList.remove(i);
        tc.end();
        System.out.println("---------------");

        System.out.println("순차적으로 삭제하기");
        tc.start();
        for (int i = arrayList.size() - 1 ; i > 0 ; i --) arrayList.remove(i);
        tc.end();

        tc.start();
        for (int i = linkedList.size() - 1 ; i > 0 ; i --) linkedList.remove(i);
        tc.end();
        System.out.println("---------------");
    }
}
