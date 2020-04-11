package Ch9.AbstractClasses.AbstractClass;

public abstract class Bird extends Animal implements ICanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathing");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " its flapping it's wings");
    }
}
