package Ch7.OOP2.PrinterChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer (47.6,true);

        printer.powerOn();
        printer.printPages(3000);
        printer.printPages(45);
        printer.printPages(-70);   //test validation
        printer.printPages(1);      //test validation
        printer.powerOff();
    }



}
