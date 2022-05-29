package lections.seventh;

public class NestedExceptionExample {

    public static void throwit() {
        System.out.println("throwit");
        throw new RuntimeException();
    }

    public static void notThrowit() {
        throwit();
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            notThrowit();
        } catch (Exception e) {
            System.out.println("caught");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
