package Ch8.ArraysAndLists.GroceryList;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++)
            System.out.println((i + 1) + "." + groceryList.get(i));
    }

    private void updateGroceryList(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified ");
    }
    public void removeGroceryItem (String item) {
        int position = findItem(item);
        if ( position >= 0 )
            removeGroceryItem(position);
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item " + " has been removed ");
    }

    private int findItem(String searchItem) {
//        boolean find = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0)
//            return groceryList.get(position);
//        return null;
        return groceryList.indexOf(searchItem);
    }

    public void updateGroceryList(String itemNO,String newItem) {
        int position = findItem(itemNO);
        if (position >= 0)
            updateGroceryList(position,newItem);
    }

    public boolean onFile ( String searchItem) {
        int position = findItem(searchItem);
        if ( position >=0) {
            return true;
        }
        else
            return false;
    }


}
