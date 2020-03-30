package Ch7.OOP2.Encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player1 = new Player();
//        player1.name = "Tim";
//        player1.health = 100;
//        player1.weapon = "Sword";
//
//        int damage = 10;
//
//        player1.loseHealth(damage);
//        System.out.println("Remaining health is: " + player1.healthRemained());
//
//
//        damage = 13;
//        player1.health = 200; // not good , needs encapsulation
//        player1.loseHealth(damage);
//        System.out.println("Remaining health is: " + player1.healthRemained());


        EnhancedPlayer player1 = new EnhancedPlayer("Tom",80,"Ak-47");
        System.out.println("Player1 health is " + player1.getHealth());
    }
}

