package Ch7.OOP2.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(hitPoints > 0 && hitPoints <= 100 ) {
            this.hitPoints = health;
        }
            this.weapon = weapon;
    }

    public void loseHealth (int damage) {
       this.hitPoints -= damage;
       if(this.hitPoints <= 0 )
           System.out.println("YOU DIED");
    }
    public int getHealth() {
        return this.hitPoints;
    }
}
