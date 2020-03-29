package Ch6.OOP1.BankApp;

public class Main {
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount();

        client1.setAccountNumber("RO413514165423");
        client1.setBalance(2000);
        client1.setCustomerName("John Smith");
        client1.setEmail("john.smith@gmail.com");
        client1.setPhoneNumber("+40746274294");

        BankAccount client2 = new BankAccount();

        System.out.println("Date Client: ");
        System.out.println(client1.getCustomerName());
        System.out.println(client1.getAccountNumber());
        System.out.println(client1.getBalance() + " lei");
        System.out.println(client1.getEmail());
        System.out.println(client1.getPhoneNumber());

        client1.deposit(300);
        client1.withdraw (2300);


        // Update

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Date Client: ");
        System.out.println(client1.getCustomerName());
        System.out.println(client1.getAccountNumber());
        System.out.println(client1.getBalance() + " lei");
        System.out.println(client1.getEmail());
        System.out.println(client1.getPhoneNumber());

        VipCustomer clientVip0 = new VipCustomer();
        System.out.println(clientVip0.getName());
        System.out.println(clientVip0.getCreditLimit());
        System.out.println(clientVip0.getEmail());

        VipCustomer clientVip1 = new VipCustomer(" Tom Perez " , 1000);
        System.out.println(clientVip1.getName());
        System.out.println(clientVip1.getCreditLimit());
        System.out.println(clientVip1.getEmail());
        VipCustomer clientVip2 = new VipCustomer(" Michael Wright " , 5000,
                "micharl.wright@gmail.com");
        System.out.println(clientVip2.getName());
        System.out.println(clientVip2.getCreditLimit());
        System.out.println(clientVip2.getEmail());
    }
}
