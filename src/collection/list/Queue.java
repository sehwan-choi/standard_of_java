package collection.list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue {

    public static void main(String[] args) {

        PriorityQueue<Object> que = new PriorityQueue<>();

        que.add(1);
        que.add(5);
        que.add(3);
        que.add(2);
        que.add(4);

        System.out.println("que = " + que);
    }
}
