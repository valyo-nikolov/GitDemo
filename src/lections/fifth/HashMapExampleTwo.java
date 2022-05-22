package lections.fifth;

import java.util.HashMap;

public class HashMapExampleTwo {

    public static void main(String[] args) {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();
        //Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
