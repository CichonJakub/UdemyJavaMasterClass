package Section4;

public class Exercise3 {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay > 23 || hourOfDay < 0){
            return false;
        }
        // cleanup version ****
        // else return barking && (hourOfDay < 8 || hourOfDay > 22);
        //****************************
        //my version below:
        else if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        else
            return false;

    }

}
