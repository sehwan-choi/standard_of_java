package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(2, 1);

        System.out.println("hashMap = " + hashMap);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 1);
        treeMap.put(2, 1);

        System.out.println("treeMap = " + treeMap);

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, 1);
        linkedHashMap.put(1, 2);

        System.out.println("linkedHashMap = " + linkedHashMap);
    }
}
