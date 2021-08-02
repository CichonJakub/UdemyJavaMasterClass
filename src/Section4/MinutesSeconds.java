package Section4;

public class MinutesSeconds {
    public static void main(String[] args) {

    }

    public static String  getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59)
            return "Invalid value";
        else {
            int hours = minutes / 60;
            int moduloMinutes = minutes % 60;
            return hours + "h " + moduloMinutes + "m " + seconds + "s";
        }

    }


    public static String getDurationString(int secounds){
        if(secounds < 0)
            return "Invalid value";
        else{

        }
    }


}
