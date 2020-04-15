package Ch10.Generics.GenericClasses;

import lombok.Getter;

import java.util.ArrayList;

@Getter
//public class Team <T extends Player & Manager & Coach> for multiple interfaces
public class Team<T extends Player> implements Comparable<Team<T>> {

    private String teamName;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tie = 0;

    //    private ArrayList<Player> members = new ArrayList<>();
    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getPlayerName() + " is already on team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getPlayerName() + " added to " + this.teamName + " team");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " won against ";
        } else if (ourScore == theirScore) {
            tie++;
            message = " draw ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tie;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
     else
        return 0;
    }
}
