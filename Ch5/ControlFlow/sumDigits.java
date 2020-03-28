package Ch5.ControlFlow;

public class sumDigits {
    public static void main(String[] args) {
        int number = 32123;
        System.out.printf("Sum of " + number + " is " + sumDigits(number));
    }

    private static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number != 0) {
                sum = sum + number % 10;
                number /= 10;
            }
            return sum;
        } else
            return -1;

    }
}
