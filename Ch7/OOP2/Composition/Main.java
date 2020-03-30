package Ch7.OOP2.Composition;



public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208","Dell","240V",dimensions);
        Monitor theMonitor = new Monitor("27 inch","Acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v.2.44");
        Computer pc = new Computer(theCase,theMonitor,theMotherboard);

        pc.getTheCase().powerButton();
        pc.powerUpAndDown();
        pc.getTheMotherboard().loadProgram("Windows 10");
        pc.openPaint();
        pc.powerUpAndDown();


        // Idea : Implement a menu , pc specs
    }
}
