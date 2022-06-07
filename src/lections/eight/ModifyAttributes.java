package lections.eight;

public class ModifyAttributes {

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.attribute = 30;
        myObject.anotherAttribute = 70;
//        myObject.X = 44;
        System.out.println(myObject.attribute);
        System.out.println(myObject.anotherAttribute);

        MyClass myObject2 = new MyClass();

        myObject2.attribute = 20;
        myObject2.anotherAttribute = 55;
        System.out.println(myObject2.attribute);
        System.out.println(myObject2.anotherAttribute);

        MyClass myObject3 = new MyClass();
        System.out.println(myObject3.attribute);
        System.out.println(myObject3.anotherAttribute);
    }
}
