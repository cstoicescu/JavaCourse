package Ch8.ArraysAndLists.LinkedList;

public class Customer {

    private String name;
    private double balance;

    public Customer (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName () {
        return this.name;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
