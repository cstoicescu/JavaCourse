package Ch10.Generics.GenericClasses;

import lombok.Getter;

@Getter
public abstract class Player {

    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }


}
