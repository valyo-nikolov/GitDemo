package lections.seventh;

public class Car extends Vehicle {
    private String brand = null;

    public Car(String br, String no) {
        super(no);
        this.brand = br;
    }
}

