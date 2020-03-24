package Ch6.OOP1.Challenge;

public class ModelS extends Car {

    private double km;

    public ModelS(String color, int releaseYear, String registrationPlate, double km) {
        super("Tesla", color, 4, releaseYear, 4, 4, "Electric",
                        "Electricity",
                registrationPlate, true);
        this.km = km;
    }


    public void accelerate ( int rate ) {
        if(isManual()) {
            int velocity = getSpeed()+rate;
            if (velocity > 0 && velocity < 20 )
                super.changingGears(1);
            else if (velocity > 0 && velocity < 40 )
                super.changingGears(2);
            else if (velocity > 0 && velocity < 60 )
                super.changingGears(3);
            else if (getSpeed() > 60 && rate < 20)
                super.changingGears(4);
            else if (getSpeed() > 80 && rate < 20)
                super.changingGears(5);

            super.move(rate);
        }
    }

    public double getKm() {
        return km;
    }



}

