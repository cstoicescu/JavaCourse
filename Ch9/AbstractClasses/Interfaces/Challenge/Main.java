package Ch9.AbstractClasses.Interfaces.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Player tim = new Player("Tim",10,15);

    saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("StormBringer");
        saveObject(tim);
//        loadObject(tim);
        System.out.println(tim);

        Saveble werewolf = new Monster("Werewolf", 20,40);
        System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

//        daca era Monster werewolf = new Monster ("Werewolf,10,40");
//        atunci mergea werewolf.getStrength();
    }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("PRESS" +
                            "\n 1. To enter a string" +
                            "\n 2. To quit");
        do{
            if(scanner.nextInt() ==2) {
                scanner.nextLine();
                break;
            }
            System.out.print("\nEnter your string: ");
            values.add(scanner.next());
            System.out.println("Do you want to enter another string?");
            System.out.println(" 1. Yes" +
                                  "\n 2. No");;
        }while(true);
        return values;
    }

    public static void saveObject(Saveble objectToSave) {
        for(int i = 0 ; i < objectToSave.write().size(); i++)
            System.out.println("Saving " + objectToSave.write().get(i) + " storage device");
    }

    public static void loadObject(Saveble objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.readList(values);
    }
}


