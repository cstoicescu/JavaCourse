package Ch5.ControlFlow;

public class SumChallange {
    public static void main (String [] args) {
         int sum=0;
         int count=0;
        for( int i = 1; i<=1000; i++) {
            if(count == 5)
                break;
            if( ( i % 3 == 0) && ( i % 5 == 0) ) {
                System.out.println("The number " + i + " can be divided by 3 " +
                        "and 5");
                sum += i;
                count ++;
            }
        }
        System.out.println("The sum is " + sum);


    }



}
