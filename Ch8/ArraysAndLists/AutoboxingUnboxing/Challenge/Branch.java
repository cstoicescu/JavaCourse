package Ch8.ArraysAndLists.AutoboxingUnboxing.Challenge;

import lombok.Getter;

import java.util.ArrayList;

public class Branch {
    @Getter
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer (String name, double amount) {
        if ( findCustomer ( name ) == null)
            return false;
        this.customers.add(new Customer(name, amount));
        return true;
    }

    private Customer findCustomer (String name ) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getCustomerName().toLowerCase().equals(name.toLowerCase()))
                return checkedCustomer;
        }
        return null;
    }

    public boolean addNewTransaction (String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        } else
            return false;
    }
}
