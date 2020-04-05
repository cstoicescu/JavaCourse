package Ch8.ArraysAndLists.LinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tim",35.45);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.54);
        System.out.println("Balance for customer " + customer.getName() + " is : " + customer.getBalance());

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(4);


        for(int i = 0; i < intArrayList.size(); i++)
            System.out.println(i+1 + ": " + intArrayList.get(i));

        intArrayList.add(1,2);

        for(int i = 0; i < intArrayList.size(); i++)
            System.out.println(i+1 + ": " + intArrayList.get(i));


    }


}
