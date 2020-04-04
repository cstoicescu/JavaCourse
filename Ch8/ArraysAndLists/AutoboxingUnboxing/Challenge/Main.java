package Ch8.ArraysAndLists.AutoboxingUnboxing.Challenge;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank (" Banca Nationala Romana");

        bank.addNewBranch("Bucuresti");

        bank.addCustomerToBranch("Bucuresti","Tom",50.45);
        bank.addCustomerToBranch("Bucuresti","Martin",125.43);
        bank.addCustomerToBranch("Bucuresti","Hanks",42.53);

        bank.addNewBranch("Buzau");
        bank.addCustomerToBranch("Buzau","Martin",152.56);

        bank.addTransactionForBranch("Bucuresti","Tom",5.1);
        bank.addTransactionForBranch("Bucuresti","Tom",8.1);
        bank.addTransactionForBranch("Bucuresti","Tom",21.1);

        bank.listCustomers("Bucuresti",false);

        bank.addNewBranch("Constanta");
    }
}
