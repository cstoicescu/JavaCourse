package Ch6.OOP1.Challenge;

public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private String engine;
    private String fuel;
    private String registrationPlate;
    private int gear;
    private boolean isManual;

    public Car(String name, String color, int numberOfSeats, int releaseYear,
               int doors, int wheels, String engine, String fuel, String registrationPlate,
               boolean isManual) {
        super(name, color, numberOfSeats, releaseYear);
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = fuel;
        this.gear = 0;
        this.registrationPlate = registrationPlate;
        this.isManual = isManual;
    }

    public void changingGears(int gear) {
        System.out.println("Changed to " + gear + " gear");
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getGear () {
        return gear;
    }



}
