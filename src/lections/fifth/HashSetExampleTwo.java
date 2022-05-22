package lections.fifth;

import java.util.HashSet;

public class HashSetExampleTwo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");
        for (String i : set) {
            System.out.println(i);
        }
        System.out.println("The hashset size is: " + set.size());
    }
}
