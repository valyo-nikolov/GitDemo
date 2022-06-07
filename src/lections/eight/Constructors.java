package lections.eight;

public class Constructors {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        System.out.println(myClass.attribute);
        System.out.println(myClass.anotherAttribute);

        MyClass myClassOther = new MyClass(11, 17);
        System.out.println(myClassOther.attribute);
        System.out.println(myClassOther.anotherAttribute);
    }
}
