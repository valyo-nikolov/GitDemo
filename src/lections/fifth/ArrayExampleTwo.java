package lections.fifth;

public class ArrayExampleTwo {

    public static void main(String args[]) {
        String[] cars = new String[3];
        cars[0] = "Volvo";
        cars[1] = "Bmw";
        cars[2] = "Mercedes";
//        cars[3] = "Mazda";

        System.out.println(cars[1]);

        cars[1] = "Karuca";
        System.out.println(cars[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars = new String[]{"Volvo", "BMW", "Ford", "Mazda"};

        double[] arr = new double[2];
        arr[0] = 0.5;
        arr[1] = 22.545;


        for (double elem : arr) {
            System.out.println(elem);
        }
    }
}
