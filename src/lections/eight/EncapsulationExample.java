package lections.eight;

public class EncapsulationExample {

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ivan Ivanov");
        b.getAccountBalance();
        b.getAccountNumber();

        System.out.println(b.getOwnerName() + " " + b.getAccountBalance() + " " + b.getAccountNumber());
    }
}


