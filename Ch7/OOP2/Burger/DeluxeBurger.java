package Ch7.OOP2.Burger;

public class DeluxeBurger extends Hamburger {

    private String addition7;
    private double additionPrice7;
    private String addition8;
    private double additionPrice8;

    public DeluxeBurger () {
        super("Deluxe Burger","Brioche Burger Buns","beef and chicken",
                8.70);
    }

    @Override
    public void addition1(String addition, double price) {
        addition7=addition;
        additionPrice7=price;
        System.out.println(this.addition7 + " added for " + additionPrice7);
    }
    @Override
    public void addition2(String addition, double price) {
        addition8=addition;
        additionPrice8=price;
        System.out.println(this.addition8 + " added for " + additionPrice8);
    }

    public void addition3(String addition, double price) {
        System.out.println("Could not add extra additions");
    }
    public void addition4(String addition, double price) {
        System.out.println("Could not add extra additions");
    }
}
