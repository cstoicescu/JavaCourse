package Ch6.OOP1.BankApp;



public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber ( String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance ( double balance) {
        this.balance = balance;
    }
    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public void setEmail ( String email) {
        this.email = email;
    }
    public void setPhoneNumber ( String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber () {
        return this.accountNumber;
    }
    public double getBalance () {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit (double amountOfMoney) {
        System.out.println("Enter the amount of money you want to deposit");
        if(amountOfMoney > 0 )
            this.balance += amountOfMoney;
        else
            System.out.println("Invalid. Enter positive amount");
    }
    public void withdraw (double amountOfMoney) {
        if (this.balance > 0 && this.balance > amountOfMoney && amountOfMoney > 0 )
            this.balance -= amountOfMoney;
        else
            System.out.println("Invalid");
    }

}
