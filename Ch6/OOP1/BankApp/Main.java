package Ch6.OOP1.BankApp;

public class Main {
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount();

        client1.setAccountNumber("RO413514165423");
        client1.setBalance(2000);
        client1.setCustomerName("John Smith");
        client1.setEmail("john.smith@gmail.com");
        client1.setPhoneNumber("+40746274294");

        System.out.println("Date Client: ");
        System.out.println(client1.getCustomerName());
        System.out.println(client1.getAccountNumber());
        System.out.println(client1.getBalance() + " lei");
        System.out.println(client1.getEmail());
        System.out.println(client1.getPhoneNumber());

        client1.deposit(300);
        client1.withdraw (6000);


        // Update

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Date Client: ");
        System.out.println(client1.getCustomerName());
        System.out.println(client1.getAccountNumber());
        System.out.println(client1.getBalance() + " lei");
        System.out.println(client1.getEmail());
        System.out.println(client1.getPhoneNumber());


    }
}
