package Section4;

public class Exercise9 {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0)
            System.out.println("Invalid Value");
        else{

            long dayInMin = 24 * 60;
            long yearInMin = dayInMin * 365;

            long hours = (minutes % dayInMin) / 60;
            long days = (minutes % yearInMin) / dayInMin;
            long years = minutes / yearInMin;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
