package Ch6.OOP1;

public class Classes {
    public static void main(String[] args) {

        Car porshe = new Car();
        Car tesla = new Car();
        porshe.setModel("911");
        tesla.setModel("Model s");
        System.out.println("The car is Porshe " + porshe.getModel());
        System.out.println("The car is Tesla " + tesla.getModel());
    }

}
