package Ch4.Methods;

public class MinutesAndSeconds {

    public static void main(String[] args) {
        System.out.println(getDurationString(601,45));
        System.out.println(getDurationString(3945));
    }


    private static String getDurationString(int minutes, int seconds) {
        int hours;

        if ((minutes < 0) || (seconds < 0) || (seconds > 59))
            return "Invalid value";
        hours = minutes / 60;
        minutes = minutes % 60;

        if (hours < 10 && minutes <10)
            return "0" + hours + "h " + "0" + minutes + "m " + seconds + "s ";
        else if (hours <10 && minutes > 10)
            return "0" + hours + "h "  + minutes + "m " + seconds + "s ";
        else if (hours > 10 && minutes > 10)
            return hours + "h " + minutes + "m " + seconds + "s ";
        else
            return hours + "h " + "0" + minutes + "m " + seconds + "s ";
    }

    private static String getDurationString(int seconds) {
        int minutes;
        if( seconds < 0 )
            return "Invalid value";
        minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes,seconds);

    }
}
