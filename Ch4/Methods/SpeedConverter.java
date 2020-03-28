package Ch4.Methods;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour <0)
            return -1;
        return Math.round(kilometersPerHour * 0.6213);

    }

    public static void main(String[] args) {
       long milesperhour =  toMilesPerHour(60);
       System.out.println("mph = " + milesperhour);
    }
}
