package Ch7.OOP2.Burger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthyBurger extends Hamburger {

    private String addition5;
    private double additionprice5;
    private String addition6;
    private double additionprice6;

    public HealthyBurger () {
        super("Healthy Hamburger","Integral Sesame Buns","chicken",4.60);
    }

    public void addition5(String addition, double price) {
        this.addition5 = addition;
        additionprice5 = price;
        System.out.println(this.addition5 + " added for " + additionprice5 );
    }
    public void addition6(String addition, double price) {
        this.addition6 = addition;
        additionprice6 = price;
        System.out.println(this.addition6 + " added for " + additionprice6 );
    }

    @Override
    public double makeHamburger() {
        double hamburgerPrice = super.makeHamburger();
        if(this.addition5 !=null)
            hamburgerPrice += additionprice5;
        if(this.addition6 !=null)
            hamburgerPrice += additionprice6;
        return hamburgerPrice;
    }
}

