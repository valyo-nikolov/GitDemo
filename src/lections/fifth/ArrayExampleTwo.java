package lections.fifth;

public class ArrayExampleTwo {

    public static void main(String args[]) {
        String[] cars = new String[3];
        cars[0] = "Volvo";
        cars[1] = "Bmw";
        cars[2] = "Mercedes";

        System.out.println(cars[1]);

        cars[1] = "Karuca";
        System.out.println(cars[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        cars = new String[]{"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
