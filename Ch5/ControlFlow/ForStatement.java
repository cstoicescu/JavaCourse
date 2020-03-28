package Ch5.ControlFlow;

public class ForStatement {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2));

        for (int i = 1; i < 9; i++)
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        System.out.println("*****************************");
        for (int i = 8; i >= 2; i--)
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));


        for ( int i = 5; i < Integer.MAX_VALUE; i++) {
            if (count == 3)
                break;
            if (isPrime(i)) {
                System.out.println("The number " + i + " is prime");
                count++;
            }
        }
    }


    public static boolean isPrime(int n) {

        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
