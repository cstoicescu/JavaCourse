package Ch9.AbstractClasses.Interfaces.Challenge;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Monster implements ISaveble{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(this.name);
        values.add("" + hitPoints);
        values.add("" + strength);
        return values;
    }

    @Override
    public void readList(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0)
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

    }
}
