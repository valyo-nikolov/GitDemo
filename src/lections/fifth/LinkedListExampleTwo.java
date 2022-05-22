package lections.fifth;

import java.util.LinkedList;

public class LinkedListExampleTwo {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo"); //adding element
        cars.addFirst("BMW"); //adding on first position
        cars.addLast("Ford"); //adding on last position
        cars.add(2, "Mazda"); //adding on 3-rd position
        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
