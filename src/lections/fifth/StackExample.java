package lections.fifth;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> elements = new Stack<>();

        // Pushing new items to the Stack
        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println(elements);
        elements.pop();
        elements.push("Test5");
        System.out.println("Stack => " + elements);

        Stack<String> otherElements = new Stack<>();
        otherElements.push("AAA");
        otherElements.push("BBb");
        otherElements.push("CCCC");

        elements.addAll(otherElements);

        System.out.println("Stack => " + elements);

        elements.removeAll(otherElements);

        System.out.println("Stack => " + elements);
    }
}
