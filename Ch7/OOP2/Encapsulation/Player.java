package Ch7.OOP2.Encapsulation;

public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth (int damage) {
        this.health -= damage;
        if(this.health <= 0 )
            System.out.println(" YOU DIED");
    }

    public int healthRemained () {
        return this.health;
    }
}
