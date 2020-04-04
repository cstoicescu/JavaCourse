package Ch8.ArraysAndLists.AutoboxingUnboxing.Challenge;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branch;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branch = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) != null) {
            this.branch.add(new Branch(branchName));
            return true;
        } else
            return false;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null)
            return branch.addNewCustomer(customerName, amount);
        return false;
    }

    public Branch findBranch(String name) {
        for (int i = 0; i < this.branch.size(); i++) {
            Branch branch = this.branch.get(i);
            if (branch.getName().toLowerCase().equals(name.toLowerCase()))
                return branch;
        }
        return null;
    }

    public boolean addTransactionForBranch(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch:" + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer" + branchCustomer.getCustomerName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions : ");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + "Amount " + transactions.get(i));
                    }
                }
            }
            return true;
        } else
            return false;
    }

}

