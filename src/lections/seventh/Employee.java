package lections.seventh;

public class Employee {

    private String firstName = null;
    private String lastName = null;
    private int birthYear = 0;

    public Employee(String first, String last, int year) {
        firstName = first;
        lastName = last;
        birthYear = year;
    }

    public Employee(String first, String last){
        this(first, last, -1);
    }
}
