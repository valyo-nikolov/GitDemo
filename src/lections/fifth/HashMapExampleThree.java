package lections.fifth;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleThree {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Ivan");
        hm.put(101, "Georgi");
        hm.put(102, "Stoyan");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        String value = hm.replace(102, "Miroslav");
        System.out.println("The replaced value is: " + value);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        boolean isReplaced = hm.replace(101, "Georgi", "Anton");
        System.out.println("The replacement is successful: " + isReplaced);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Asen");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
