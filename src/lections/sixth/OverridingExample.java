package lections.sixth;

public class OverridingExample {

    static class Animal {
        public void displayInfo() {
            System.out.println("I am an animal.");
        }
    }

    static class Dog extends Animal {
        public void displayInfo() {
            super.displayInfo();
            System.out.println("I am a dog.");
        }
    }

    public static void main(String[] args) {
        OverridingExample.Dog d1 = new OverridingExample.Dog();
        d1.displayInfo();
    }
}