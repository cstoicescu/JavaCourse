package Ch5.ControlFlow;

public class WhileStatement {
    public static void main(String[] args) {
        int count = 5;
        int number = 4;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
        count=0;
       while ( number <= 20 && count!= 5) {
           number ++;
           if (!isEvenNumber((number)))
               continue;
           System.out.println("Even number " + number );
           count++;
       }
        System.out.println("There are " + count + " even number");

    }


    public static boolean isEvenNumber ( int number) {
        if ( number % 2 ==0)
            return true;
        else
            return false;

    }
}
