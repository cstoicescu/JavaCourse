package Ch8.ArraysAndLists.Arrays;

import java.util.Scanner;

public class Minimum {

    private static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {

       int[] intArray = readIntegers(7);
        System.out.println("Minimum element in the array is: " + findMin(intArray));
    }


    private static int[] readIntegers (int count) {
        System.out.println("Enter the elements of array ");
        int[] array = new int [count];

        for ( int i = 0; i < array.length; i++ )
            array[i] = scanner.nextInt();
        return array;
    }

    private static int findMin (int[] array ) {
        int min = array [ 0 ] ;
        for ( int i = 0 ; i < array.length; i++ )
            if ( array[i] < min)
                min = array[i];
            return min;

    }
}
