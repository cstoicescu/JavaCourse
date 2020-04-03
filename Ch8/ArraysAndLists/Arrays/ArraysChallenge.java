package Ch8.ArraysAndLists.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private static Scanner scanner = new Scanner ( System.in );

    public static void main(String[] args) {


        int[] intArray = getIntegers(6);
        intArray = sortArray(intArray);
        printArray(intArray);

        System.out.println("*******************************");
        System.out.println("Array Copy");
        int[] array = Arrays.copyOf(intArray,intArray.length);
        printArray(array);

        // sau Arrays.sort(intArray);
    }

    public static int[] getIntegers(int dimension) {
        System.out.println("Enter elements of array : ");
        int[] array = new int[dimension];
        for( int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        return array;

    }

    public static void printArray (int[] array) {
        for ( int i = 0 ; i < array.length; i++ )
            System.out.println("Element " + i + " value is " + array[i]);
    }

    public static int[] sortArray ( int[] array ) {
        int temp ;
        for ( int i = 0; i < array.length-1; i++ ) {
            for ( int j = i+1 ; j < array.length; j++)
                if (array[j] > array[i] ) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        return array;
    }
}
