package Ch8.ArraysAndLists.GroceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Press");
        System.out.println("0 - To print choice option");
        System.out.println("1 - To print the list of grocery items");
        System.out.println("2 - To add an item in the list");
        System.out.println("3 - To modify an item from the list");
        System.out.println("4 - To remove an item from the list");
        System.out.println("5 - To search for an item in the list");
        System.out.println("6 - To quit the application.");

    }

    public static void addItem () {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem () {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.updateGroceryList(itemNo,newItem);
    }

    public static void removeItem() {
        System.out.print(" Enter item number you want to remove: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem () {
        System.out.print(" Item to search for: ");
        String itemSearch = scanner.nextLine();
        if ( groceryList.onFile(itemSearch))
            System.out.println("Item " + itemSearch + " found in your grocery list");
        else
            System.out.println("Item " + itemSearch + " has not been found");
    }

    public static void processArrayList () {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String> ( groceryList.getGroceryList());
    }
}
