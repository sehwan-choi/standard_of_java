package collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Map {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("A","A");
        map.put("B","B");
        map.put("C","C");
        map.put("D","D");

        Set<java.util.Map.Entry<String, String>> entries = map.entrySet();
        ArrayList arrayList = new ArrayList(entries);
        System.out.println("arrayList = " + arrayList);
    }
}
