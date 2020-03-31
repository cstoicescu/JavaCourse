package Ch7.OOP2.PrinterChallenge;

public class Printer {

    private double tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer (double tonerLevel, boolean isDuplex) {
        if(this.tonerLevel >= 0 && this.tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 0;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void powerOn () {
        System.out.println("Printer is now online");
        checkTonerLevel();
    }

    public void refillToner () {
        if ( this.tonerLevel ==0  || this.tonerLevel < 0) {
            System.out.println("Refilling Toner ");
            this.tonerLevel = 100;
            System.out.println("Toner Level is now " + this.tonerLevel + "%");
        }
    }
    public void printPages ( int pages ) {
        if (this.tonerLevel > 0 && this.tonerLevel <= 100) {
            if (isDuplex) {
                if (pages == 1)
                    print(pages);
                else
                    print( pages / 2 + pages % 2 ) ;
            }
            else
                print(pages);
        }
        else {
            System.out.println("OUT OF TONER, please refill");
            refillToner();
            printPages(pages);
        }
    }
    private void print(int pages) {
        if (pages == 1) {
            System.out.println("********************************************");
            System.out.println("Printing page ...");
                if(this.tonerLevel <= 0) {
                    System.out.println(0 + " pages printed");
                    System.out.println("OUT OF TONER, please refill");
                    refillToner();
                }
                this.pagesPrinted++;
                this.tonerLevel -= 0.15;

            System.out.println(pages + " page printed");
            checkTonerLevel();
            printDone();
        } else if (pages > 0) {
            System.out.println("********************************************");
            System.out.println("Printing pages ...");
            for ( int i = 0; i < pages; i++) {
                if(this.tonerLevel <= 0) {
                    System.out.println(this.pagesPrinted + " pages printed");
                    System.out.println("OUT OF TONER, please refill");
                    refillToner();
                }
                this.pagesPrinted++;
                this.tonerLevel -= 0.15;
            }
            System.out.println(pages+ " pages printed");
            checkTonerLevel();
            printDone();
        }
        else if (pages <= 0 ) {
            System.out.println("********************************************");
            System.out.println("No pages to print");
        }
    }

    private void printDone() {
        System.out.println("********************************************");
        System.out.println("Printing Done");

    }

    public void checkTonerLevel () {
        System.out.println("Toner level is : " + String.format("%.2f",this.tonerLevel));
    }

    public void powerOff () {
        System.out.println("********************************************");
        System.out.println("Printer is now offline");
    }

    public int getPagesPrinted (){
        return this.pagesPrinted;
    }
}
