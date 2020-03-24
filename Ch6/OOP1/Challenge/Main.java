package Ch6.OOP1.Challenge;

public class Main {
    public static void main(String[] args) {

        ModelS modelS1 = new ModelS("Grey", 2019,"B-10-WTF",
                20.45);


        System.out.println(modelS1.getName());
        System.out.println(modelS1.getColor());
        System.out.println(modelS1.getNumberOfSeats());
        System.out.println(modelS1.getSpeed());
        System.out.println(modelS1.getReleaseYear());
        System.out.println(modelS1.isManual());
        System.out.println(modelS1.getFuel());
        System.out.println(modelS1.getRegistrationPlate());
        System.out.println(modelS1.getKm());

        modelS1.accelerate(40);
        modelS1.stop();
        modelS1.steer(4);

        modelS1.accelerate(60);



    }
}
