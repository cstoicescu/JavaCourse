package Ch7.OOP2.Composition;

public class Computer {

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;
    private String computerState;

    public Computer(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
        this.computerState = "Shutdown";
    }

    public void powerUpAndDown() {
        if(computerState == "Shutdown") {
            System.out.println("Booting ...");
            drawLogo();
            this.computerState = "Running";
        }
        else
        {
            System.out.println("The computer is shuting down");
            shutDown();
        }

    }

    public void shutDown() {
        closeApps();
        theMonitor.drawPixelAt(450,450,"black");
        System.out.println("The computer is now shut down");
    }
    private void closeApps() {
        System.out.println("Closing all apps");
    }
    private void drawLogo () {
        // Fancy graphics;
        getTheMonitor().drawPixelAt(1200,50,"yellow");
    }
    public Case getTheCase() {
        return theCase;
    }
    public void openPaint() {
        System.out.println("Opening Paint");
        theMonitor.drawPixelAt(910,400,"blue");
    }
    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
