package Ch4.Methods;

public class Overloading {
    public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
        System.out.printf("New score is " + newScore);

        calculateScore(75);

       double centimeters = calcFeetAndInchesToCentimeters(6,0);
            if  ( centimeters < 0.0)
                System.out.printf("Invalid");

            calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playername, int score) {
        System.out.println(" Player " + playername + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore( int score) {
        System.out.println(" Unnamed  scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println(" No player no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double Feet, double Inches) {
        double centimeters;
        if( ( Feet < 0 ) || (( Inches <0) || (Inches > 12 )) )
            return -1;
        centimeters = Feet * 30.48 + Inches * 2.54;
        System.out.println("inches " + Inches + " feet " + Feet + " = " + centimeters + " centimeters");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters( double Inches) {
        double inchesToFeet;
        if ( Inches < 0 ) {
            return -1;
        }
        inchesToFeet = (int) Inches / 12;
        double remainingInches = (int) Inches % 12;
        return calcFeetAndInchesToCentimeters(inchesToFeet,remainingInches);

    }
}
