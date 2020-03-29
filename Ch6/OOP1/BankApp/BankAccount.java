package Ch6.OOP1.BankApp;



public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

   public  BankAccount () {
       this("RO414XXXXXXXXXXXX",0,"Default Name", "example_mail@gmail.com",
               "+407xxxxxxxx");
   }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                    String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
       this("RO40XXXXXXXXXXX",50,customerName,email,phoneNumber);
       this.customerName = customerName;
       this.email = email;
       this.phoneNumber = phoneNumber;
    }

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
        if(amountOfMoney > 0 )
            this.balance += amountOfMoney;
        else
            System.out.println("Invalid. Enter positive amount");
    }
    public void withdraw (double amountOfMoney) {
        if (this.balance > 0 && this.balance - amountOfMoney >= 0 )
            this.balance -= amountOfMoney;
        else
            System.out.println("Invalid");
    }




}
