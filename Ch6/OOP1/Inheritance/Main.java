package Ch6.OOP1.Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 6);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20,
                "long silkie");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
