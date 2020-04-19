package Ch10.Generics.GenericClasses;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable <T extends Team >{
    private String leagueName;
    private ArrayList<T> teams;

    public LeagueTable (String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam ( T team) {
        if(!this.teams.contains(team)) {
            this.teams.add(team);
            return true;
        }
        else {
            System.out.println("Team already in this league");
            return false;
        }
    }

    public void tableRankings() {
        System.out.println(this.leagueName + " Ranking Table");
        Collections.sort(teams);
        for ( T t : teams) {
            System.out.println(t.getTeamName() + " : " + t.ranking());
        }
    }
}
