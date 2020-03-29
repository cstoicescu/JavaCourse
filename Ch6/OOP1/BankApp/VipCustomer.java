package Ch6.OOP1.BankApp;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer () {
        this("Default Name" , 100, "defaultmail@gmail.com");
    }
    public VipCustomer (String name, double creditLimit) {
        this(name,creditLimit,"defaultmail@gmail.com");
    }
    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName () {
        return this.name;
    }
    public double getCreditLimit () {
        return this.creditLimit;
    }
    public String getEmail () {
        return this.email;
    }
}
