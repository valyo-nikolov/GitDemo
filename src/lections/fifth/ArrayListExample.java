package lections.fifth;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo"); //adding element in ArrayList
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println("ArrayList size is: " + cars.size());

        cars.set(1, "Mercedes"); //change element
        cars.remove(2);//Remove element
        System.out.println(cars);
        System.out.println(cars.get(0) /*Access element*/);
        //Loop through ArrayList
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("ArrayList size is: " + cars.size());

        Collections.sort(cars); //Sorting ArrayList
        //Loop through ArrayList
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
