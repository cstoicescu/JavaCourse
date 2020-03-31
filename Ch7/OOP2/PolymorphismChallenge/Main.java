package Ch7.OOP2.PolymorphismChallenge;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car (String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;

    }

    public String getName () {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String startEngine() {
        return "Car --> startEngine()";
    }

    public String accelerate() {
        return "Car --> Accelerate";
    }

    public String brake() {
        return "Car --> Accelerate";
    }
}

class  ModelS extends Car {

    public ModelS () {
        super("ModelS", 0);
    }

    @Override
    public String startEngine() {
        return "ModelS --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "ModelS --> accelerate()";
    }

    @Override
    public String brake() {
        return "ModelS --> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi () {
        super("Mitsubishi",4);

    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake()";
    }


}

 class  X3 extends Car {

    public X3 () {
        super("X3", 0);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> start engine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" --> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()  + " --> brake()";
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Base Car",8);

        System.out.println( car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());

        ModelS car1 = new ModelS();
        System.out.println(car1.getName());
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        Mitsubishi car2 = new Mitsubishi();
        System.out.println(car2.getName());
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

        X3 car3 = new X3();
        System.out.println(car3.getName());
        System.out.println(car3.startEngine());
        System.out.println(car3.accelerate());
        System.out.println(car3.brake());
    }


}
