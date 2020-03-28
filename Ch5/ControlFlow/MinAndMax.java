package Ch5.ControlFlow;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int number = 0;
        int min=0;
        int max=0;
        boolean firstInput = true;
        System.out.println("Enter numbers : ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                number = scanner.nextInt();
                if(firstInput == true)
                {
                    min=number;
                    max=number;
                    firstInput = false;
                }
                if(number > max)
                    max = number;
                else if (number < min)
                    min = number;
            }
            else {
                System.out.println("Invalid number");
                break;
            }
        }
            if(firstInput == false) {
                System.out.println("min = " + min);
                System.out.println("max = " + max);
            }
            else
                System.out.println("It must be a number");
    }
}
