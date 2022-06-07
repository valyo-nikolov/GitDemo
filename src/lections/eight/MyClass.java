package lections.eight;

public class MyClass {

    final int X = 5;

    int attribute = 5;
    int anotherAttribute = 8;

    public MyClass() {
    }

    public MyClass(int attribute, int anotherAttribute) {
        this.attribute = attribute;
        this.anotherAttribute = anotherAttribute;
    }

    public static void printHello() {
        System.out.println("Hello. This method can be called   WITHOUT creating object of class ClassExample");
    }

    public void printHelloOfObject() {
        System.out.println("Hello. This method can be called only if you create an object of class ClassExample");
        System.out.println("Non-static variables as x can be accessed ONLY by non-static (object) methods");
        System.out.println("The value of x is: " + this.X + " The value of x is accessed by method printHelloOfObject.");
    }
}
