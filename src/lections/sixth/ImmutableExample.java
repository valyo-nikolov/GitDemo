package lections.sixth;

public class ImmutableExample {

    public static void main(String[] args) {

        Student s = new Student("Ivan", 101);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());

        //s.regNo = 102;
    }
}

