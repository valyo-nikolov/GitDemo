package lections.eight;

public class AbstractionExample {

    public static void main(String[] args) {

        PigSub myPig = new PigSub(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Abstract class
abstract class AnimalAbs {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class PigSub extends AnimalAbs {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}