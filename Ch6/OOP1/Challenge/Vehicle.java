package Ch6.OOP1.Challenge;

public class Vehicle {

    private String name;
    private String color;
    private int numberOfSeats;
    private int speed;
    private int releaseYear;
    private int direction;

    public Vehicle(String name, String color, int numberOfSeats, int releaseYear) {
        this.name = name;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.speed = 0;
        this.releaseYear = releaseYear;
        this.direction = 0;
    }



    public void stop (){
        this.speed = 0;
    }


    public void move (int speed) {
        this.speed += speed;
        System.out.println("The vehicle is moving with " + this.speed + " km / h");
    }

    public void steer (int direction){
        this.direction += direction;
        System.out.println("The vehicle is moving at " + direction + " degress");
    }

    public String getName () {
        return this.name;
    }
    public String getColor () {
        return this.color;
    }
    public int getNumberOfSeats () {
        return this.numberOfSeats;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getReleaseYear () {
        return this.releaseYear;
    }

    public int getDirection () {
        return this.direction;
    }
}



