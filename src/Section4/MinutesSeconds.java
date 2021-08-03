package Section4;

public class MinutesSeconds {
    public static void main(String[] args) {

        System.out.println(getDurationString(72, 40));
        System.out.println(getDurationString(4360));

    }

    public static String  getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59)
            return "Invalid value";
        else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }

    }


    public static String getDurationString(int secounds){
        if(secounds < 0)
            return "Invalid value";
        else{
            int hours = secounds / (3600);
            int minutes = (secounds % 3600) / 60;
            int remainingSecounds = secounds % 60;

            return hours + "h " + minutes + "m " + remainingSecounds + "s";
        }
    }


    //secoud way - using previous method
    public static String getDurationString2(int secounds){
        if(secounds < 0)
            return "Invalid value";
        else{
            int minutes = secounds / 60;
            int remainingSecounds = secounds % 60;

            return getDurationString(minutes, remainingSecounds);
        }
    }




}
