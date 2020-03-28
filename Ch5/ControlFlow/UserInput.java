package Ch5.ControlFlow;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println(name + " is " + age + " years old");
            } else
                System.out.println("Invalid year of birth");
        } else
            System.out.println("The year of birth must be an int");
        scanner.close();
    }
}
