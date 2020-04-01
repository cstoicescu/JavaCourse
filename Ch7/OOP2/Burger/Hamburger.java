package Ch7.OOP2.Burger;

import lombok.Getter;

@Getter
public class Hamburger {


    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String addition1;
    private double additionprice1;
    private String addition2;
    private double additionprice2;
    private String addition3;
    private double additionprice3;
    private String addition4;
    private double additionprice4;

    public Hamburger (String name, String breadType, String meat,double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;

    }

    public void selectedBurger() {
        System.out.println("*************************************************************");
        System.out.println("You selected " + this.name + " on " + this.breadType + " price "
        +this.price);
    }

    public void addition1(String addition, double price) {
        this.addition1 = addition;
        additionprice1 = price;
        System.out.println(this.addition1 + " added for " + additionprice1);
    }

    public void addition2(String addition, double price) {
        this.addition2 = addition;
        additionprice2 = price;
        System.out.println(this.addition2 + " added for " + additionprice2);
    }
    public void addition3(String addition, double price) {
        this.addition3 = addition;
        additionprice3 = price;
        System.out.println(this.addition3 + " added for " + additionprice3);
    }
    public void addition4(String addition, double price) {
        this.addition4 = addition;
        additionprice4 = price;
        System.out.println(this.addition4 + " added for " + additionprice4);
    }

    public double makeHamburger () {
        double hamburgerPrice = this.price;
        if(this.addition1 !=null)
            hamburgerPrice += additionprice1;
        if(this.addition2 !=null)
            hamburgerPrice += additionprice2;
        if(this.addition3 !=null)
            hamburgerPrice += additionprice3;
        if(this.addition4 !=null)
            hamburgerPrice += additionprice4;
        return hamburgerPrice;
    }



}
