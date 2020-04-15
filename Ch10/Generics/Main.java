package Ch10.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tom");
        items.add(4);
        items.add(5);
        items.add(6);

        printDouble(items);
    }

    private static void printDouble (ArrayList<Integer> arrayList) {
//        for( Object i : arrayList) {
//            System.out.println((Integer) i*2);
//        }   // no longer needed bc i used Integer Generics
        for( int i : arrayList) {
            System.out.println(i*2);
        }
    }
}
