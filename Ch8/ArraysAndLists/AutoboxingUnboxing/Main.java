package Ch8.ArraysAndLists.AutoboxingUnboxing;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class Main {

     static class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }


    }
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(40);
        Double doubleValue = new Double(40.3);

        ArrayList<Integer> intArrayList = new ArrayList<>();


        //autoboxing
        for( int i = 0 ; i < 10; i++)
            intArrayList.add(Integer.valueOf(i));

        //unboxing
        for( int i = 0 ; i < 10; i++) {
            System.out.println(i + "-> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = Integer.valueOf(56);
        Integer myInTValue1 = 57;  // Integer.valueOf(57);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();

        for ( double dbl = 0.0; dbl <= 10.0; dbl +=  0.5)
            myDoubleValues.add(dbl);
        for ( int i = 0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }

    }
}
