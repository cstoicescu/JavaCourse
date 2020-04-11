package Ch9.AbstractClasses.InnerClass;

import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner (System.in);
    private  static Button btnPrint = new Button ("Print");

    public static void main(String[] args) {

//    class ClickListener implements Button.OnClickListener {
//        public ClickListener () {
//            System.out.println("I've been atachted");
//        }
//
//        @Override
//        public void onClick(String title) {
//            System.out.println(title + " was clicked");
//        }
//
//    }
//    btnPrint.setOnClickListener( new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
    listen();

//        Gearbox mcLaren = new Gearbox(6);
//
////        mcLaren.addGear(1,14.4);
////        mcLaren.addGear(2,19.4);
////        mcLaren.addGear(3,21.4);
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(3000));
//
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//

    }

    private static void listen() {
        System.out.println("Press 1 to click and 0 to quit ");
        do {
            if(scanner.nextInt() ==0 )
            {
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
            btnPrint.OnClick();

        }while (true);
    }

}
