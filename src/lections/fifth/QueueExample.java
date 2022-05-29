package lections.fifth;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        pq.add("TestA");
        pq.add("TestB");
        pq.add("TestC");
        pq.add("TestD");
        pq.add("TestE");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove("TestD");
        System.out.println(pq);
        for (String i : pq) {
            System.out.println(i);
        }
    }
}
