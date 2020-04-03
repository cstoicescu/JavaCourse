package Ch8.ArraysAndLists.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of elements: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] anArray = new int[count];
        System.out.println("Enter the values of elements:");

        for (int i = 0; i < anArray.length; i++)
            anArray[i] = scanner.nextInt();
        scanner.nextLine();
        System.out.println(Arrays.toString(anArray));
        reverse(anArray);
    }

    private static void reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.printf(Arrays.toString(array));
    }

}
