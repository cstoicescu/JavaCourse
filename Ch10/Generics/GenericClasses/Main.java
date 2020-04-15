package Ch10.Generics.GenericClasses;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo");
        BaseballPlayer mike = new BaseballPlayer("Mike Trout");
        SoccerPlayer sallah = new SoccerPlayer("Mohammed Sallah");



        // team class allows all types of players to join team
        // need check so that only certain types of players to join team;
        // use GENERICS
//        Team realMadrid = new Team ("Real Madrid");
        Team<FootballPlayer> realMadrid = new Team<>("Real Madrid"); // generic class
        realMadrid.addPlayer(ronaldo);
//        realMadrid.addPlayer(mike);
//        realMadrid.addPlayer(sallah);

        System.out.println(realMadrid.getTeamName() + " has " + realMadrid.numPlayers() + " players");

        Team<BaseballPlayer>  newYorkYankees = new Team<>("NewYork Yankees");
        newYorkYankees.addPlayer(mike);


        // returns exception, need to restrict type
        // should use bounded type parameters (use extends Player) this way i can restrict type for generics
//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

        // the argument passed for type parameter can be either a class or interface
        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United" );
        manchesterUnited.addPlayer(sallah);


        Team<FootballPlayer> barcelona = new Team<>("Barcelona");
        Team<FootballPlayer> juventus = new Team<>("Juventus");
        realMadrid.matchResult(juventus,2,2);
        realMadrid.matchResult(barcelona,4,1);

    //    realMadrid.matchResult(newYorkYankees,4,5); // error bc added Team<T>  generic

        System.out.println("Rankings");
        System.out.println(realMadrid.getTeamName() + " : " + realMadrid.ranking());
        System.out.println(juventus.getTeamName() + " : " + juventus.ranking());
        System.out.println(barcelona.getTeamName() + " : " + barcelona.ranking());

        System.out.println(juventus.compareTo(realMadrid));

        ArrayList<Team> teams = new ArrayList<>();
        Collections.sort(teams);
    }
}
