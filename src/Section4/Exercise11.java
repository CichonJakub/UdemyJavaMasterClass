package Section4;

public class Exercise11 {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature < 25)
            return false;
        else if(summer){
            if(temperature > 45 )
                return false;
            else return true;
        } else if(temperature > 35)
            return false;
        else return true;
    }


    public static boolean isCatPlaying2(boolean summer, int temperature){
        if(temperature < 25)
            return false;
        else if(summer){
            return temperature <= 45;
        } else return temperature <= 35;
    }


}
