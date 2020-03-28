package Ch5.ControlFlow;

public class Switch {

    public static void main(String[] args) {
        int switchValue = 2;
        // byte char short and int
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3, or 4, or 5");
                break;
            default:
                System.out.println("The value is not 1 or 2");
                break;
        }

        char character = 'b';

        switch(character) {
            case 'A':
                System.out.println("The character is A");
                break;
            case 'B':
                System.out.println("The character is B");
                break;
            case 'C':
                System.out.printf("The character is C");
                break;
            case 'D':
                System.out.println("The character is D");
                break;
            default:
                System.out.println("The character is not A, B, C, or D");
                break;
        }

        String month = "January";

        switch(month.toLowerCase()) {
            case "january" :
                System.out.println("Month is Jan");
                break;
            case "june" :
                System.out.println("Month is Jun");
                break;
        }

    }
}

