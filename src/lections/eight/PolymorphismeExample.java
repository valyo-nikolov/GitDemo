package lections.eight;

public class PolymorphismeExample {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();  // Create a Animal object
        Pig myPig = new Pig();  // Create a Pig object
        Dog myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends AnimalAbs {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends AnimalAbs {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}