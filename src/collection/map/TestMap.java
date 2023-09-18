package collection.map;

import common.TestClass;
import time.TimeChecker;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestMap {

    public static void main(String[] args) {
        TimeChecker timeChecker = new TimeChecker();
        HashMap<Object, Object> hashMap1 = new HashMap<>();
        for (int i = 0 ; i < 1000000 ; i++) {
            hashMap1.put(i,i);
        }

        hashMap1.clear();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        timeChecker.start();
        System.out.println("test : " + hashMap1.get(55235));
        timeChecker.end();


        for (int i = 0 ; i < 10000000 ; i++) {
            hashMap.put(i,i);
        }

        timeChecker.start();
        System.out.println("hashMap : " + hashMap.get(5325235));
        timeChecker.end();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0 ; i < 10000000 ; i++) {
            treeMap.put(i,i);
        }

        timeChecker.start();
        System.out.println("treeMap : " + treeMap.get(5345235));
        timeChecker.end();

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0 ; i < 10000000 ; i++) {
            linkedHashMap.put(i,i);
        }

        timeChecker.start();
        System.out.println("linkedHashMap : " + linkedHashMap.get(5345235));
        timeChecker.end();
    }
}
