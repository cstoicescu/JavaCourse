package Ch8.ArraysAndLists.AutoboxingUnboxing.Challenge;

import lombok.Getter;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double amount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(amount);
    }

    public void addTransaction (double amount) {
        this.transactions.add(amount);
    }

   public String getCustomerName () {
        return this.customerName;
   }

   public ArrayList<Double> getTransaction () {
        return this.transactions;
   }


}
