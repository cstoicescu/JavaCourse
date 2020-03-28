package Ch4.Methods;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        calculateScore(5,6);
        int position = calculateHighScorePosition(50);
        displayHighScorePosition("Johnny Cage",position);

    }


    public static void calculateScore(int a, int b){

        int score = a + b;
        System.out.println("Score is: " + score);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.printf(playerName + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int score){


        if(score > 1000)
            return 1;
        else if(score >= 500)
            return  2;
        else if (score >100 )
            return 3;
        return 4;
    }
}


