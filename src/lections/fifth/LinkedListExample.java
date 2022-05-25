package lections.fifth;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));


        cars = new LinkedList<>();
        cars.add("Volvo"); //adding element
        cars.addFirst("BMW"); //adding on first position
        System.out.println(cars);
        cars.addLast("Ford"); //adding on last position
        cars.add(2, "Mazda"); //adding on 3-rd position
        System.out.println(cars);
        cars.remove(); //removes first element
        cars.removeFirst(); //removes first element
        cars.removeLast(); //removes last element
        cars.removeAll(cars); //remove all elements
//        cars.remove(2);//Remove element
        boolean exists = cars.contains("BMW");
        System.out.println(cars);
        System.out.println(exists);
    }
}
