package Ch9.AbstractClasses.Interfaces.Challenge;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Player implements ISaveble {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    @Override
    public String toString() {
        return "Player:" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add(Integer.toString(this.hitPoints));
        values.add("" + this.strength);
        values.add(this.weapon);
        return values;
    }

    @Override
    public void readList(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0)
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
    }

}
