package Ch7.OOP2.Burger;



public class Main {
    public static void main(String[] args) {

        Hamburger basicHamburger = new Hamburger("Big Green Egg","Sesame Buns",
                "Beef",2.50);

        basicHamburger.selectedBurger();

        basicHamburger.addition1("Cheese",0.4);
        basicHamburger.addition2("Tomato",0.9);
        basicHamburger.addition3("Salad",1.2);

        System.out.println("Total price for hamburger is :" + basicHamburger.makeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.selectedBurger();
        healthyBurger.addition1("Cheese",0.4);
        healthyBurger.addition2("Tomato",0.9);
        healthyBurger.addition3("Salad",1.2);
        healthyBurger.addition4("Lettuce",0.5);
        healthyBurger.addition5("Carrot",0.7);
        healthyBurger.makeHamburger();
        System.out.println("Total price for hamburger is :" + healthyBurger.makeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.selectedBurger();

        deluxeBurger.addition1("Chips",2);
        deluxeBurger.addition2("Drinks",2.5);
        deluxeBurger.addition3("Tomato",0.9);

    }
}
