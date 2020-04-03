package Ch8.ArraysAndLists.Arrays;

import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        myArray[0] = 6;
        myArray[5] = 15;
        double[] myDoubleArray = new double[20];
        System.out.println(myArray[5]);

        for (int i = 0; i < myArray.length; i++)
            myArray[i] = i * 2;
        printArray(myArray);

        int[] intArray = getIntegers(5);
        printArray(intArray);
        System.out.println("the average is " + getAverage(intArray));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the values for your new Array");
        int[] values = new int[number];

        for( int i = 0; i < values.length; i++ )
            values[i] = scanner.nextInt();
        return values;
    }

    public static double getAverage (int[] array) {
        int sum = 0;
        for( int i = 0; i < array.length; i++)
            sum += array[i];
        return  (double)(sum / array.length);
    }
}
