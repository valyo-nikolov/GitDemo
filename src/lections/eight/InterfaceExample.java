package lections.eight;

public class InterfaceExample {

    public static void main(String[] args) {
        PigInter myPig = new PigInter();  // Create a PigInter object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Pig "implements" the AnimalInterface interface
class PigInter implements AnimalInterface {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}