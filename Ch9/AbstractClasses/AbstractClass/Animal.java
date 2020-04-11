package Ch9.AbstractClasses.AbstractClass;

import lombok.Getter;

public abstract class Animal {
    @Getter
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

}
