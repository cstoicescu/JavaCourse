package Ch5.ControlFlow;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        boolean isDigit = scanner.hasNextInt();
        if (isDigit) {
             sum = 0;
            for (int i = 0; i < 10; i++)
            {
                sum = sum + scanner.nextInt();
            }
        }
        else
            System.out.println("Invalid Number");
        System.out.println("sum = " + sum);

        scanner.close();
    }
}
